package com.example.springdi.springbootdependencyinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            TaxCalculator taxCalculator = ctx.getBean(TaxCalculator.class);
            System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(23000));
            System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(10000));
            System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(50000));
            System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(200000));
        };
    }
}
