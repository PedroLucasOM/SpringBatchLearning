package com.springbatch.SpringBatchLearning.model;

import lombok.*;

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

}
