package com.springbatch.SpringBatchLearning.writer.config;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAccountClassifierWriterConfig {

    @Bean
    public ClassifierCompositeItemWriter<BankAccount> bankAccountClassifier(
            @Qualifier("clientInvalidFileWriter") FlatFileItemWriter<BankAccount> clientInvalidFileWriter,
            CompositeItemWriter<BankAccount> bankAccountGenerateCompositeWriter
    ) {
        return new ClassifierCompositeItemWriterBuilder<BankAccount>()
                .classifier(classifier(clientInvalidFileWriter, bankAccountGenerateCompositeWriter))
                .build();
    }

    private Classifier<BankAccount, ItemWriter<? super BankAccount>> classifier(FlatFileItemWriter<BankAccount> clientInvalidFileWriter, CompositeItemWriter<BankAccount> bankAccountGenerateCompositeWriter) {
        return new Classifier<BankAccount, ItemWriter<? super BankAccount>>() {
            @Override
            public ItemWriter<? super BankAccount> classify(BankAccount bankAccount) {
                if (bankAccount.getBankAccountType() == null) {
                    return clientInvalidFileWriter;
                } else {
                    return bankAccountGenerateCompositeWriter;
                }
            }
        };
    }

}
