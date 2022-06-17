package com.amigos.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(1969, FEBRUARY, 5),
                    22
            );

            Student alex = new Student(
                    "alex",
                    "alex.gone@gmail.com",
                    LocalDate.of(1989, FEBRUARY, 5),
                    22
            );

            Student john = new Student(
                    "john",
                    "john.gone@gmail.com",
                    LocalDate.of(1999, AUGUST, 5),
                    29
            );

            repository.saveAll(List.of(mariam, alex));

        };

    }
}
