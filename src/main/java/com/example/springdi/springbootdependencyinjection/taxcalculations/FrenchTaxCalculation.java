package com.example.springdi.springbootdependencyinjection.taxcalculations;


import org.springframework.stereotype.Component;

@Component("FrenchTaxCalculation")
public class FrenchTaxCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.48;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
