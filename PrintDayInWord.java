package hus.oop.lab1;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt(); //dayNumber is 0,1,2,3,..,7
        printDayInWordByIf(dayNumber);
        printDayInWordBySwitchCase(dayNumber);
    }
    public static void printDayInWordByIf(int dayNumber) {
        if (dayNumber == 1) {
            System.out.println("MONDAY");
        } else if (dayNumber == 2) {
            System.out.println("TUESDAY");
        } else if (dayNumber == 3) {
            System.out.println("WEDNESDAY");
        } else if (dayNumber == 4) {
            System.out.println("THURDAY");
        } else if (dayNumber == 5) {
            System.out.println("FRIDAY");
        } else if (dayNumber == 6) {
            System.out.println("SARTUDAY");
        } else {
            System.out.println("SUNDAY");
        }
    }

    public static void printDayInWordBySwitchCase(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SARTUDAY");
                break;
            default:
                System.out.println("SUNDAY");
        }
    }
}

