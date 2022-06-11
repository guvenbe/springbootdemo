package com.amigos.springbootdemo;

import com.amigos.springbootdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(1966, Month.FEBRUARY,5),
                        21

                )
        );
    }

}
