package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commendlineRunner(StudentRepository repository)
    {
        return args ->
        {
            Student konrad = new Student(
                    "Konrad",
                    LocalDate.of(2000, Calendar.SEPTEMBER + 1, 30),
                    "konrad.augustynoicz11@gmail.com"
                    );
            repository.saveAll(List.of(konrad));
        };
    }
}
