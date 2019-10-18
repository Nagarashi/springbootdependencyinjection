package com.example.springdi.springbootdependencyinjection;

import com.example.springdi.springbootdependencyinjection.taxcalculations.AmericanTaxCalculation;
import com.example.springdi.springbootdependencyinjection.taxcalculations.BelgianTaxCalculation;
import com.example.springdi.springbootdependencyinjection.taxcalculations.FrenchTaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TaxCalculatorTest {

    @Mock
    BelgianTaxCalculation belgianTaxCalculation;


    @InjectMocks
    TaxCalculator taxCalculator;

    @Test
    void testBelgianCalculator() {
        Mockito.when(belgianTaxCalculation.calculateTaxes(23000)).thenReturn(10350.0);

        double taxCalculation = taxCalculator.calculateTaxesBasedOnYearlyIncome(23000);

        Assertions.assertEquals(taxCalculation, 10350.0);
    }

}