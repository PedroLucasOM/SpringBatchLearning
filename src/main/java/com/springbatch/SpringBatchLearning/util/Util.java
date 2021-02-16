package com.springbatch.SpringBatchLearning.util;

import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    private static final SimpleDateFormat dayFormat = new SimpleDateFormat("dd/MM/yyy");
    private static final SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");

    public static boolean isSameDay(Date date1, Date date2) {
        return date1 != null && date2 != null && date1.getTime() == date2.getTime();
    }

    public static String dayFormat(Date date) {
        return dayFormat.format(date);
    }

    public static String hourOfDayFormat(Date date) {
        return hourFormat.format(date);
    }

    public static Resource createOutputDirectory(Resource resource, String relativePath) throws IOException {
        if (!resource.exists()) {
            resource = resource.createRelative(relativePath);
        }
        return resource;
    }

    public static void verifyOutputDirectory(Resource resource, String relativeOutput) {
        if (!resource.exists()) {
            File file = new File(relativeOutput);
            file.mkdirs();
        }
    }
}
