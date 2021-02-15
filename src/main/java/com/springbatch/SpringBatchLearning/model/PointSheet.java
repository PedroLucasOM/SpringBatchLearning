package com.springbatch.SpringBatchLearning.model;

import lombok.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PointSheet {

    private String name;
    private int registration;
    private String date;
    private Integer month;
    private Integer year;
    private Map<String, List<String>> registryPoints = new HashMap<>();

    @Override
    public String toString() {
        return "FolhaPonto{" +
                "nome=" + this.name +
                ", matricula=" + this.registration +
                ", registrosPontos=" + this.registryPoints +
                "}";
    }
}
