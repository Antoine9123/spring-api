package com.spring.SpringApi.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "David",
                        "David@gmail.com",
                        21,
                        LocalDate.of(2020, Month.AUGUST,5)
                )
        );
    }
}
