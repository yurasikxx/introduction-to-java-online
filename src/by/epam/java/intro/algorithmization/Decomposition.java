package by.epam.java.intro.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class Decomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
                //натуральных чисел:
                int a = 10;
                int b = 5;
                System.out.println("Greatest common factor: " + greatestCommonFactor(a, b));
                System.out.println("Least common multiple: " + (a * b / greatestCommonFactor(a, b)));
            }

            case 2 -> {
                //2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
                int a = 35;
                int b = 15;
                int c = 5;
                int d = 70;
                System.out.println("Greatest common factor: " + greatestCommonFactor(greatestCommonFactor(a, b), greatestCommonFactor(c, d)));
            }

            case 3 -> {
                //3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
                //треугольника.
                int a = 5;
                System.out.println("Regular hexagon area: " + getTriangleArea(a) * 6);
            }

            case 4 -> {
                //4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
                //из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
                int[] a = new int[]{5, 1, 2, 5};
                int[] b = new int[]{1, 4, 3, 6};

                distanceBetweenPoints(a, b);
            }

            case 5 -> {
                //5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
                //которое меньше максимального элемента массива, но больше всех других элементов).
                int[] array = new int[]{4, 1, 3, 2, 7};

                System.out.println("Second max number in array is: " + secondMaxNumber(array));
            }

            case 6 -> {
                //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
                int a = 1;
                int b = 10;
                int c = 15;

                String str = greatestCommonFactor(greatestCommonFactor(a, b), c) == 1 ? "Mutually prime" : "Not mutually prime";
                System.out.println(str);
            }

            case 7 -> {
                //7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

                System.out.println("Factorials sum: " + factorialsSum(array));
            }

            case 8 -> {
                //8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
                //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
                //массива с номерами от k до m.
                int[] D = new int[]{1, 4, 6, 7, 5, 6};

                System.out.println("Sum of selected elements: " + sumOfSelectedElements(D));
            }

            case 9 -> {
                //9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
                //если угол между сторонами длиной X и Y— прямой.
                int x = 4;
                int y = 10;
                int z = 5;
                int t = 12;

                System.out.println("QuadrilateralArea: " + getQuadrilateralArea(x, y, z, t));
            }

            case 10 -> {
                //10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
                //являются цифры числа N.
                int n = 1234543;

                System.out.println(arrayShaper(n));
            }

            case 11 -> {
                //11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
                int a = 123;
                int b = 99;

                System.out.println(digitCounter(a, b));
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }

    public static int greatestCommonFactor(int x, int y) {
        return y == 0 ? x : greatestCommonFactor(y, x % y);
    }

    public static double getTriangleArea(int a) {
        return (Math.sqrt(3) / 4 * Math.pow(a, 2));
    }

    public static void distanceBetweenPoints (int[] x, int[] y) {
        double mx = 0.0;
        int xx = 0;
        int yy = 0;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                double d = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
                if (mx < d) {
                    mx = d;
                    xx = x[i];
                    yy = y[i];
                }
            }
        }
        System.out.println("x = " + xx + ", y = " + yy);
    }

    public static int secondMaxNumber(int[] a) {
        int max = a[0];
        int secondMax = a[0];

        for (int element : a) {
            if (element > max) {
                max = element;
            }
            if (element < max && element >= secondMax) {
                secondMax = element;
            }
        }

        return secondMax;
    }
    public static int factorialsSum(int[] a) {
        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= a.length; i += 2) {
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }

        return sum;
    }

    public static int sumOfSelectedElements(int[] a) {
        int k = 1;
        int m = 3;
        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static double getQuadrilateralArea(int a, int b, int c, int d) {
        double e = Math.sqrt(a * a + b * b); //Диагональ напротив прямого угла, нашли по теореме Пифагора
        double s1 = a * b * 0.5; //Первая часть площади четырехугольника
        double s2 = 0.25 * Math.sqrt((e + c + d) * (e + c - d) * (e + d - c) * (c + d - e)); //Вторая часть площади четырехугольника, найдено по формуле Герона
        return s1 + s2;
    }

    public static String arrayShaper(int n) {
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] a = new int[count];
        int j = count - 1;
        while (n != 0) {
            a[j--] = n % 10;
            n /= 10;
        }

        return Arrays.toString(a);
    }

    public static int digitCounter(int a, int b) {
        int x = a;
        int y = b;
        int countX = 0;
        int countY = 0;

        while (x != 0) {
            x /= 10;
            countX++;
        }

        while (y != 0) {
            y /= 10;
            countY++;
        }

        //int length = (int) (Math.log10(a) + 1);

        return countX > countY ? a : b;
    }
}