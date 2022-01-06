package com.example.demo.student;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Max = new Student(
                    1L,
                    "Max",
                    "Max@email.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );

            Student Alex = new Student(
                    2L,
                    "Alex",
                    "Alex@email.com",
                    LocalDate.of(2005, Month.JANUARY,2)
            );

            studentRepository.saveAll(List.of(Max,Alex));
        };
    }
}
