package com.massivian.interview.exercises.refactor.primes;

/**
 * Prints prime numbers to console.
 */
public class PrimePrinter {
    public static void print(final int[] primeArray, final int maxRows, final int maxColumns){
        int maxNumbers = primeArray.length-1;
        int pageNumber = 1;
        int pageOffset = 1;
        int rowOffset;
        int currentColumn;
        while (pageOffset <= maxNumbers) {
            System.out.printf("The First %d", maxNumbers);
            System.out.printf(" Prime Numbers === Page %d", pageNumber);
            System.out.println("\n");
            for (rowOffset = pageOffset; rowOffset <= pageOffset + maxRows - 1; rowOffset++) {
                for (currentColumn = 0; currentColumn <= maxColumns - 1; currentColumn++)
                    if (rowOffset + currentColumn * maxRows <= maxNumbers) System.out.printf("%10d", primeArray[rowOffset + currentColumn * maxRows]);
                System.out.println();
            }
            System.out.println("\f");
            pageNumber++;
            pageOffset += maxRows * maxColumns;
        }
    }
}
