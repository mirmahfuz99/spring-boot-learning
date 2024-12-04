package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mir = new Student(
                "Mir",
                "mir@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
            
            );

            Student mahfuz = new Student(
                "Mahfuz",
                "mahfuz@gmail.com",
                LocalDate.of(2001, Month.JANUARY, 6)
            );

            repository.saveAll(List.of(mir, mahfuz));
        };
    }
}
