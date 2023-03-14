package com.hillel.zasiedko.homeworks.homeworks1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1==number2){
            if (number1==number3){
                System.out.println(number1 + " " + number2 + " " + number3);
            }else {
                System.out.println(number1 + " " + number2);
            }
        }else if (number1 == number3){
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}
