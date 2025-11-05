package com.diego.interfaces;
import java.math.BigDecimal;

public interface TaxCalculator {
    BigDecimal tax(BigDecimal amount);
}