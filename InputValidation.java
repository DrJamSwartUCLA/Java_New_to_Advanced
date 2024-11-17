package hus.oop.lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberIn;
        boolean isValid;

        do {
            System.out.print("Enter an integer between 0-10 or 90-100: ");
            numberIn = scanner.nextInt();
            isValid = (numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100);

            if (!isValid) {
                System.out.println("Invalid input. Please enter an integer between 0-10 or 90-100.");
            }
        } while (!isValid);

        System.out.println("You have entered: " + numberIn);
    }
}

