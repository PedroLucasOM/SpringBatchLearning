package com.springbatch.SpringBatchLearning.util;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
}
