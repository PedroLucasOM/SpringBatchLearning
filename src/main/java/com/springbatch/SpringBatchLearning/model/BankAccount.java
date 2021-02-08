package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BankAccount {

    @NotNull
    private Integer id;
    @NotNull
    private BankAccountType bankAccountType;
    @NotNull
    private Double maxLimit;
    @NotBlank
    private String clientId;

}
