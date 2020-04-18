package com.massivian.interview.exercises.refactor.primes;

/**
 * Class with utility methods to calculate or work with prime numbers.
 */
public class PrimeCalculator {

    final static int ORDMAX = 30;

    public int[] calculatePrimes(final int maxNumbers) {
        int[] primeArray = new int[maxNumbers + 1];
        int[] multiples = new int[ORDMAX + 1];
        int square = 9;
        int ord = 2;
        int currentPrime = 1;
        boolean isPrime;

        primeArray[1] = 2;
        for (int j = 3; currentPrime < maxNumbers; j += 2) {
            if (j == square) {
                ord++;
                square = primeArray[ord] * primeArray[ord];
                multiples[ord - 1] = j;
            }
            isPrime = true;
            int n = 2;
            while (n < ord && isPrime) {
                while (multiples[n] < j)
                    multiples[n] += primeArray[n] + primeArray[n];
                if (multiples[n] == j) isPrime = false;
                n++;
            }
            if (isPrime) {
                currentPrime++;
                primeArray[currentPrime] = j;
            }
        }
        return primeArray;
    }
}
