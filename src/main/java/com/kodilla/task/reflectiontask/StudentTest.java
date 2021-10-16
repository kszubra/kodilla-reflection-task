package com.kodilla.task.reflectiontask;

import java.lang.reflect.Field;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentTest {

    public static void main(String[] args) throws IllegalAccessException {

        Student student = new Student();

        Class<Student> descriptor = Student.class;
        for (Field field : descriptor.getDeclaredFields()) {
            field.setAccessible(true);
            log.info("Student field: {fieldType: {}, fieldName: {}, value: {}}",
                    field.getType(),
                    field.getName(),
                    field.get(student)
                    );
        }
    }
}
