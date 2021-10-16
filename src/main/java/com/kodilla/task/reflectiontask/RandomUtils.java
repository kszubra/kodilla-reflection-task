package com.kodilla.task.reflectiontask;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomString(Integer length) {
        return UUID.randomUUID()
                .toString()
                .replaceAll("-", "")
                .substring(0,length);
    }

    public static Integer getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public static Date getRandomDate() {
        return new Date(ThreadLocalRandom.current().nextInt() * 1000L);
    }
}
