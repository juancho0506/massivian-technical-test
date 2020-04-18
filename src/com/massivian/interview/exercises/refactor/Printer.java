package com.massivian.interview.exercises.refactor;

import com.massivian.interview.exercises.refactor.primes.PrimeCalculator;
import com.massivian.interview.exercises.refactor.primes.PrimePrinter;

public class Printer {
    public static void main(String[] args) {
        final int maxNumbers = 1000;
        PrimeCalculator calculator = new PrimeCalculator();
        final int[] primeArray = calculator.calculatePrimes(maxNumbers);

        final int maxRows = 50;
        final int maxColumns = 4;
        PrimePrinter.print(primeArray, maxRows, maxColumns);
    }
}
