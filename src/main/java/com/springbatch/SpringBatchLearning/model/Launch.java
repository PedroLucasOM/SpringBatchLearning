package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Launch {

    @EqualsAndHashCode.Include
    private Integer codeNatureExpense;
    private String descriptionNatureExpense;
    private String launchDescription;
    private Date launchDate;
    private Double launchValue;

}
