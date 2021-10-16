package com.kodilla.task.reflectiontask;

import static com.kodilla.task.reflectiontask.RandomUtils.getRandomNumber;
import static com.kodilla.task.reflectiontask.RandomUtils.getRandomString;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Student {

    private String indexNumber;
    private StudentPersonalData personalData;
    private Map<String, Integer> grades;


    public Student() {
        this.indexNumber = getRandomString(10);

        this.personalData = new StudentPersonalData();
        this.grades = new HashMap<>();
        int subjectCount = getRandomNumber(1, 8);
        for(int i = 0; i < subjectCount ; i++) {
            grades.put(UUID.randomUUID().toString(), getRandomNumber(2,5));
        }
    }
}
