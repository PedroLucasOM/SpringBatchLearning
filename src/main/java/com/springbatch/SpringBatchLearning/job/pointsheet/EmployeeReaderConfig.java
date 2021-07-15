package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.Employee;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class EmployeeReaderConfig {

    @Bean
    public JdbcCursorItemReader<Employee> employeeReader(
            @Qualifier("appDataSource") DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Employee>()
                .name("employeeReader")
                .dataSource(dataSource)
                .sql("select *, MONTH(date) as month, YEAR(date) as year from employee left join point_registry on registration = employee_id order by registration")
                .beanRowMapper(Employee.class)
                .build();
    }

}
