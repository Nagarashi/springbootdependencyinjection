package com.example.springdi.springbootdependencyinjection.taxcalculations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.45;

    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
