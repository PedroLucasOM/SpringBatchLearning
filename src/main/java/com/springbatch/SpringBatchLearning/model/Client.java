package com.springbatch.SpringBatchLearning.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {

    @NotNull
    @Size(min = 1, max = 100)
    @Pattern(regexp = "[a-zA-Z\\s]+", message = "Name must be alphabetic")
    private String name;
    @NotNull
    @Size(min = 1, max = 100)
    @Pattern(regexp = "[a-zA-Z\\s]+", message = "Nickname must be alphabetic")
    private String nickname;
    @NotNull
    @Range(min = 18, max = 200)
    private Integer age;
    @NotNull
    @Size(min = 1, max = 50)
    @Email
    private String email;
    @NotNull
    private Double salaryRange;
    private List<Transaction> transactionList = new ArrayList<>();

}
