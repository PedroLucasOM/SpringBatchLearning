package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.PointSheet;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileFooterCallback;
import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.batch.item.support.builder.CompositeItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.Writer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class PointSheetWriterConfig {

    @Bean
    public CompositeItemWriter<PointSheet> pointSheetCompositeWriter(
            @Qualifier("pointSheetWriter") FlatFileItemWriter<PointSheet> pointSheetWriter,
            JdbcBatchItemWriter<PointSheet> pointSheetJdbcWriter
    ) {
        return new CompositeItemWriterBuilder<PointSheet>()
                .delegates(pointSheetWriter, pointSheetJdbcWriter)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<PointSheet> pointSheetJdbcWriter(
            @Qualifier("appDataSource") DataSource dataSource
    ) {
        return new JdbcBatchItemWriterBuilder<PointSheet>()
                .dataSource(dataSource)
                .sql("INSERT INTO point_sheet (month, year, employee_id, registry_points) VALUES (?, ?, ?, ?)")
                .itemPreparedStatementSetter(itemPreparedStatementSetter())
                .build();
    }

    private ItemPreparedStatementSetter<PointSheet> itemPreparedStatementSetter() {
        return new ItemPreparedStatementSetter<PointSheet>() {
            @Override
            public void setValues(PointSheet pointSheet, PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setInt(1, pointSheet.getMonth());
                preparedStatement.setInt(2, pointSheet.getYear());
                preparedStatement.setInt(3, pointSheet.getRegistration());
                preparedStatement.setString(4, pointSheet.getRegistryPoints().toString());
            }
        };
    }

    @StepScope
    @Bean
    public FlatFileItemWriter<PointSheet> pointSheetWriter(
            @Value("${spring-batch-learning.output}filePointSheet.txt") Resource output
    ) {
        return new FlatFileItemWriterBuilder<PointSheet>()
                .name("pointSheetWriter")
                .resource(output)
                .lineAggregator(lineAggregator())
                .headerCallback(headerCallback())
                .footerCallback(footerCallback())
                .build();
    }

    private LineAggregator<PointSheet> lineAggregator() {
        return new LineAggregator<PointSheet>() {
            @Override
            public String aggregate(PointSheet pointSheet) {
                StringBuilder writer = new StringBuilder();
                writer.append(String.format("----------------------------------------------------------------------------\n"));
                writer.append(String.format("NOME:%s\n", pointSheet.getName()));
                writer.append(String.format("MATRICULA:%s\n", pointSheet.getRegistration()));
                writer.append(String.format("----------------------------------------------------------------------------\n"));
                writer.append(String.format("%10s%10s%10s%10s%10s", "DATA", "ENTRADA", "SAIDA", "ENTRADA", "SAIDA"));

                for (String registryPointDate : pointSheet.getRegistryPoints().keySet()) {
                    writer.append(String.format("\n%s", registryPointDate));

                    for (String registry : pointSheet.getRegistryPoints().get(registryPointDate)) {
                        writer.append(String.format("%10s", registry));
                    }
                }
                return writer.toString();
            }
        };
    }

    private FlatFileFooterCallback footerCallback() {
        return new FlatFileFooterCallback() {
            @Override
            public void writeFooter(Writer writer) throws IOException {
                writer.append(String.format("\n\t\t\t\t\t\t\t  Código de Autenticação: %s\n", "fkyew6868fewjfhjjewf"));
            }
        };
    }

    private FlatFileHeaderCallback headerCallback() {
        return new FlatFileHeaderCallback() {
            @Override
            public void writeHeader(Writer writer) throws IOException {
                writer.append(String.format("SISTEMA INTEGRADO: XPTO \t\t\t\t DATA: %s\n",
                        new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
                writer.append(String.format("MÓDULO: RH \t\t\t\t\t\t\t\t HORA: %s\n",
                        new SimpleDateFormat("HH:MM").format(new Date())));
                writer.append(String.format("\t\t\t\tFOLHA DE PONTO\n"));
            }
        };
    }

}
