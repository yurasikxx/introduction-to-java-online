package by.epam.java.intro.basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
                //все числа от 1 до введенного пользователем числа.
                int sum = 0;

                System.out.print("Enter any positive integer: ");
                int num = in.nextInt();

                for (int i = 1; i <= num; i++) {
                    sum = sum + i;
                }

//                int i = 1;
//                while (i != num) {
//                    sum = sum + i;
//                    i++;
//                }

                System.out.println("Result: " + sum);
            }

            case 2 -> {
                //2. Вычислить значения функции на отрезке [а,b] c шагом h:
                System.out.print("Enter a: ");
                int a = in.nextInt();
                System.out.print("Enter b: ");
                int b = in.nextInt();
                System.out.print("Enter h: ");
                int h = in.nextInt();

                do {
                    int x = a;
                    int y;
                    if (x <= 2) {
                        y = -x;
                    } else {
                        y = x;
                    }

                    System.out.println("y = " + y);
                    a += h;
                } while (a <= b);
            }

            case 3 -> {
                //3. Найти сумму квадратов первых ста чисел
                int sum = 0;
                for (int i = 0; i <= 100; i++) {
                    sum = (int) (sum + pow(i, 2));
                }

                System.out.println(sum);
            }

            case 4 -> {
                //4. Составить программу нахождения произведения квадратов первых двухсот чисел.
                for (int i = 0; i <= 200; i++) {
                    System.out.println((int) (pow(i, 2)));
                }
            }

            case 5 -> {
                //5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
                //заданному е. Общий член ряда имеет вид:
                int n = 5;
                double a;
                double e = 0.45128486651845;
                double sum = 0;

                for (int i = 1; i < n; i++) {
                    a = 1 / pow(2, i) + 1 / pow(3, i);
                    if (abs(a) >= e) {
                        sum += a;
                    }
                }

                System.out.println("Sum: " + sum);
            }

            case 6 -> {
                //6. Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.
                char ch = 0;

                for (int i = 0; i <= 255; i++, ch++) {
                    System.out.println("Symbol " + ch + " has number " + i + " in ASCII");
                }
            }

            case 7 -> {
                //7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
                //m и n вводятся с клавиатуры.
                System.out.println("Enter m: ");
                int m = in.nextInt();
                System.out.println("Enter n: ");
                int n = in.nextInt();

                for (int i = m; i < n; i++) {
                    System.out.print("Divider of number " + i + ": ");
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                }
            }

            case 8 -> {
                //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
                int[] arr = new int[10];
                int a = 8684216;
                int b = 1268453;

                System.out.println("Numbers: ");
                System.out.println(a);
                System.out.println(b);
                System.out.print("Repeating digits: ");

                while (a != 0) {
                    arr[a % 10]++;
                    a /= 10;
                }

                while (b != 0) {
                    System.out.println(arr[b % 10]);
                    if (arr[b % 10] != 0) {
                        System.out.print(b % 10 + " ");
                    }
                    b /= 10;
                }
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}