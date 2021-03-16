package by.epam.java.intro.basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
                System.out.print("Enter a: ");
                int a = in.nextInt();
                System.out.print("Enter b: ");
                int b = in.nextInt();
                System.out.print("Enter c: ");
                int c = in.nextInt();

                int z = ((a - 3) * b / 2) + c;

                System.out.println("Function value: " + z);
            }

            case 2 -> {
                //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
                double a = 5.3;
                double b = 2.8;
                double c = 3.1;

                double result = ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2);
                System.out.println("Expression value: " + result);
            }

            case 3 -> {
                //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                double x = 3.1;
                double y = 2.9;

                double result = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
                System.out.println("Expression result: " + result);
            }

            case 4 -> {
                //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
                //дробную и целую части числа и вывести полученное значение числа.
                double initial = 333.444;
                double result = (initial * 1000) % 1000 + (int) initial / 1000.0;

                System.out.println("Initial: " + initial);
                System.out.println("Result: " + result);

            }

            case 5 -> {
                //5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
                //данное значение длительности в часах, минутах и секундах в следующей форме:
                //ННч ММмин SSc.
                int time = 51058;

                System.out.println(time / 3600 + ":" + time / 60 % 60 + ":" + time % 60);
            }

            case 6 -> {
                //6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
                //принадлежит закрашенной области, и false — в противном случае:
                System.out.print("Enter x: ");
                int x = in.nextInt();
                System.out.print("Enter y: ");
                int y = in.nextInt();
                boolean flag;

                flag = x >= -4 && x <= 4 && y >= -3 && y <= 4;
                System.out.println(flag);
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}