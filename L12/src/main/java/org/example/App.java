package org.example;


import Z2.AnotherT;
import Z2.Tester;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, ИМЯ");
        Tester a = new Tester("Иван", "16 лет", 16,3,10.32);
        System.out.println("Введите число от 1 до 2 (можно и другие)");
        int a1 = scanner.nextInt();
        System.out.println("Сколько? (лучше немного)");
        int b1 = scanner.nextInt();
        AnotherT.function2(a1, a, b1);
    }

}
