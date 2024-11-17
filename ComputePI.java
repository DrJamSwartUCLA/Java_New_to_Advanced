package hus.oop.lab1;
import java.util.Scanner;

public class ComputePI {
    public static void checkSumWithMAX_DENOMINATOR(double sum) {
        int MAX_DENOMINATOR = 1000;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        double result = 4 * sum;
        if (Math.PI == result) {
            System.out.println(result + " = " + Math.PI);
        } else {
            System.out.println(result + " != " + Math.PI);
        }
    }
    public static void checkSumWithMAX_TERM(double sum) {
        int MAX_TERM = 10000;
        for(int term = 1; term <= MAX_TERM; term++) {
            if(term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            }
            else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        double pi = Math.PI;
        double percentageDifferece = (sum / pi) * 100;
        System.out.println("Percentage difference: " + percentageDifferece);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        checkSumWithMAX_TERM(sum);

    }
}

