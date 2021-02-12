package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class BudgetStatement {

    private Integer codeNatureExpense;
    private String descriptionNatureExpense;
    private Double totalValue;
    private List<Launch> launchs = new ArrayList<>();

}
