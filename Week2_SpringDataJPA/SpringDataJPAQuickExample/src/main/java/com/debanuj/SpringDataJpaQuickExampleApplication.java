package com.debanuj;

import com.debanuj.entity.Employee;
import com.debanuj.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaQuickExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaQuickExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployeeRepository repository) {

        return args -> {

            Employee employee = new Employee(101L, "Debanuj");

            repository.save(employee);

            System.out.println("Employee saved successfully!");

        };
    }
}