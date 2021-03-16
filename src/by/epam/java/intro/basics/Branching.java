package by.epam.java.intro.basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Branching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
                //он прямоугольным.
                System.out.print("Enter a: ");
                int a = in.nextInt();
                System.out.print("Enter b: ");
                int b = in.nextInt();

                if (180 - b - a > 0) {
                    System.out.println("There is such a triangle");
                    if (a == 90 || b == 90 || 180 - a - b == 90) {
                        System.out.println("This is a right triangle");
                    }
                } else {
                    System.out.println("There is no such triangle");
                }
            }

            case 2 -> {
                //2. Найти max{min(a, b), min(c, d)}.
                System.out.print("Enter a: ");
                int a = in.nextInt();
                System.out.print("Enter b: ");
                int b = in.nextInt();
                System.out.print("Enter c: ");
                int c = in.nextInt();
                System.out.print("Enter d: ");
                int d = in.nextInt();

                System.out.println("Result: " + max(min(a,b), min(c,d)));
            }

            case 3 -> {
                //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
                double x1 = 3;
                double x2 = 2;
                double x3 = 1;
                double y1 = 2;
                double y2 = 6;
                double y3 = 1;

                if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
                    System.out.println("Points lie on one straight line");
                } else {
                    System.out.println("Points do not lie on one straight line");
                }
            }

            case 4 -> {
                //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
                //отверстие.
                System.out.print("Enter a: ");
                int a = in.nextInt();
                System.out.print("Enter b: ");
                int b = in.nextInt();
                System.out.print("Enter x: ");
                int x = in.nextInt();
                System.out.print("Enter y: ");
                int y = in.nextInt();
                System.out.print("Enter z: ");
                int z = in.nextInt();

                if (x <= a || x <= b && y <= a || y <= b) {
                    System.out.println("The brick will pass");
                } else if (x <= b && z <= a || z <= b) {
                    System.out.println("The brick will pass");
                } else if (z <= a) {
                    System.out.println("The brick will pass");
                } else {
                    System.out.println("The brick won't pass");
                }
            }

            case 5 -> {
                //5. Вычислить значение функции:
                System.out.print("Enter x: ");
                int x = in.nextInt();
                double result;

                if (x <= 3) {
                    result = pow(x, 2) - 3 * x + 9;
                } else {
                    result = 1 / (pow(x, 3) + 6);
                }

                System.out.println("Result: " + result);
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}