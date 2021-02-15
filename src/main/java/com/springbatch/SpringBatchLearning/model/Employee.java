package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @EqualsAndHashCode.Include
    private int registration;
    private String name;
    private int age;
    private Date date;
    private Integer month;
    private Integer year;
    private List<Date> pointRegistry = new ArrayList<>();

    @Override
    public String toString() {
        return "Funcionário{" +
                "matrícula: " + registration +
                ", registrosPonto: " + pointRegistry +
                "}";
    }

}
