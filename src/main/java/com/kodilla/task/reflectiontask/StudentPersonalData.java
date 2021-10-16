package com.kodilla.task.reflectiontask;

import static com.kodilla.task.reflectiontask.RandomUtils.getRandomDate;
import static com.kodilla.task.reflectiontask.RandomUtils.getRandomString;

import java.util.Date;

public class StudentPersonalData {
    private Date birthday;
    private String name;

    public StudentPersonalData() {
        this.birthday = getRandomDate();
        this.name = getRandomString(10);
    }
}
