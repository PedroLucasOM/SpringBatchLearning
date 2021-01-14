package com.springbatch.SpringBatchLearning.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private String id;
    private String description;
    private Double value;

}
