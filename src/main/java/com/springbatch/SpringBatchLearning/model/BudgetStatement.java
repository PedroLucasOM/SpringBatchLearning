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

    @Override
    public String toString() {
        String format = "---- Demonstrativo orçamentário ----\n";
        format += String.format("[%s] %s - R$ %f", codeNatureExpense, descriptionNatureExpense, totalValue) + "\n";
        for (Launch launch : launchs) {
            format += String.format("          [%s] %s - R$ %f",
                    launch.getLaunchDate().toString(),
                    launch.getDescriptionNatureExpense(),
                    launch.getLaunchValue()) + "\n";
        }
        return format;
    }

}
