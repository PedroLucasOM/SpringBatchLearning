package com.springbatch.SpringBatchLearning.job.pointsheet;

import com.springbatch.SpringBatchLearning.model.Employee;
import com.springbatch.SpringBatchLearning.model.PointSheet;
import com.springbatch.SpringBatchLearning.util.Util;
import org.springframework.batch.item.ItemProcessor;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PointSheetItemProcessor implements ItemProcessor<Employee, PointSheet> {

    @Override
    public PointSheet process(Employee employee) throws Exception {
        PointSheet pointSheet = new PointSheet();
        pointSheet.setRegistration(employee.getRegistration());
        pointSheet.setName(employee.getName());
        Collections.sort(employee.getPointRegistry());
        pointSheet.setRegistryPoints(registryPointGenerate(employee.getPointRegistry()));
        pointSheet.setMonth(employee.getMonth());
        pointSheet.setYear(employee.getYear());
        return pointSheet;
    }

    private Map<String, List<String>> registryPointGenerate(List<Date> points) {
        return points.stream().collect(Collectors.groupingBy(Util::dayFormat,
                Collectors.mapping(Util::hourOfDayFormat, Collectors.toList())));
    }
}
