package hus.oop.lab1;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }
}
