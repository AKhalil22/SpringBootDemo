package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Ammar = new Student(
                    "Ammar",
                    "ammar@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 22),
                    19
            );

            Student Louis = new Student(
                    "Louis",
                    "louis@gmail.com",
                    LocalDate.of(2019, Month.APRIL, 2),
                    5
            );

            repository.saveAll(
                    List.of(Ammar, Louis)
            );
        };
    }
}
