package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {

    private String name;
    private String nickname;
    private Integer age;
    private String email;
    private List<Transaction> transactionList = new ArrayList<>();

}
