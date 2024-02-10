package Own;

import java.util.Scanner;

public class SimpleDigitOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate and display digit occurrences
        displayDigitOccurrences(number);

        scanner.close();
    }

    // Function to calculate and display the occurrences of each digit in a number
    private static void displayDigitOccurrences(int number) {
        System.out. println("Digit occurrences in the number:");

        for (int digit = 0; digit <= 9; digit++) {
            int occurrences = calculateDigitOccurrences(number, digit);// Here passing num and 1st digit zero and check how many time zero occurrences  and  return occurrence of zero and check if grater then zero of occurrence and print digit and occurrence similar to 1 to 9 one by one check upto 9 
            if (occurrences > 0) {
                System.out.println("Digit " + digit + ": " + occurrences + " times");
            }
        }
    }

    // Function to calculate the occurrences of a specific digit in a number
    private static int calculateDigitOccurrences(int number, int digitToCheck) {
        int occurrences = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit

            if (digit == digitToCheck) {
                occurrences++;
            }

            number /= 10; // Move to the next digit
        }

        return occurrences;
    }
}

