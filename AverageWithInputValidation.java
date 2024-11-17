package hus.oop.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 3;

        int numberInt;
        boolean isValid;

        int sum = 0;
        double average;

        for(int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            isValid = false;

            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberInt = sc.nextInt();
                if(numberInt > 0 && numberInt < 100) {
                    isValid = true;
                }
                else {
                    System.out.println("Invalid input try again...");
                }
            }while(!isValid);
            sum += numberInt;
        }
        average = (double) sum / 3;
        System.out.println("The average is: " + average);

    }
}

