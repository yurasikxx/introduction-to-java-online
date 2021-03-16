package by.epam.java.intro.algorithmization;

import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
                int [] array = new int[]{100, 51, 48, 10, 20, 42, 80, 30, 98, 65};
                int sum = 0;
                final int K = 10;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] % K == 0) {
                        sum += array[i];
                    }
                }

                System.out.println("Sum of multiples: " + sum);

/*                String result = sum == 0 ? "There are no multiples of " + K : "Sum of multiples of " + K + ": " + sum;
                System.out.println(result);*/
            }

            case 2 -> {
                //2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
                //числом. Подсчитать количество замен.
                double [] doubles = new double[]{5.3, 10.2, 3.4, 7.1, 19.2, 42.3, 18.4, 8.3};
                final int Z = 8;
                int swap = 0;

                System.out.println("Initial array: ");
                for (int i = 0; i < doubles.length; i++) {
                    System.out.print(doubles[i] + " ");
                }

                for (int i = 0; i < doubles.length; i++) {
                    if (doubles[i] > Z) {
                        doubles[i] = Z;
                        swap++;
                    }
                }

                System.out.println("\nSwapped array: ");
                for (int i = 0; i < doubles.length; i++) {
                    System.out.print(doubles[i] + " ");
                }

                System.out.println("\nNumber of swaps: " + swap);
            }

            case 3 -> {
                //3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
                //положительных и нулевых элементов.
                double [] doubles = new double[]{4.3, -3.2, 0.0, 3.2, 95.4, -5.1, -9.45, 100.5, -3.8};
                int positive = 0;
                int negative = 0;
                int zero = 0;

                for (int i = 0; i < doubles.length; i++) {
                    System.out.print(doubles[i] + " ");
                }

                for (int i = 0; i < doubles.length; i++) {
                    if (doubles[i] > 0) {
                        positive++;
                    } else if (doubles[i] < 0){
                        negative++;
                    } else {
                        zero++;
                    }
                }

                System.out.println("\nThere are " + positive + " positive, " + negative + " negative and " +
                        + zero + " zero elements.");
            }

            case 4 -> {
                //4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
                double [] doubles = {4.3, 9.2, 2.3, 8.4, 1.6};
                int max = 0;
                int min = 0;

                System.out.println("Initial array: ");
                for (int i = 0; i < doubles.length; i++) {
                    System.out.print(doubles[i] + " ");
                }

                for (int i = 0; i < doubles.length; i++) {
                    if (doubles[max] < doubles[i]) {
                        max = i;
                    }
                    if (doubles[min] > doubles[i]) {
                        min = i;
                    }
                }

                double temp = doubles[max];
                doubles[max] = doubles[min];
                doubles[min] = temp;

                System.out.println("\nChanged array: ");
                for (int i = 0; i < doubles.length; i++) {
                    System.out.print(doubles[i] + " ");
                }
            }

            case 5 -> {
                //5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
                int [] array = new int[]{3, 1, 2, 5, 6, 2, 3, 4, 52, 12, 42};

                System.out.println("Initial array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

                System.out.println("\nNumbers of array for which array[i] > i: ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > i) {
                        System.out.print(array[i] + " ");
                    }
                }
            }

            case 6 -> {
                //6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
                //являются простыми числами.
                float [] floats = new float[]{4.3f, 5.3f, 2.2f, 4.2f, 95.5f, 102.4f, 9.3f, 53.3f, 7.6f, 76.8f, 95.3f};
                float sum = 0f;

                System.out.println("Initial array: ");
                for (int i = 0; i < floats.length; i++) {
                    System.out.print(floats[i] + " ");
                }

                for (int i = 0; i < floats.length; i++) {
                    if (isPrime(i)) {
                        sum += floats[i];
                    }
                }

                System.out.println("\nSum: " + sum);
            }

            case 7 -> {
                //7. Даны действительные числа a1, a2, ..., an. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1).
                double [] doubles = new double[]{3.2, 6.3, 6.4, 2.3, 8.5, 10.9};

                double maxSum = doubles[0] + doubles[doubles.length - 1];
                for (int i = 0; i < doubles.length / 2; i++) {
                    if ((doubles[i] + doubles[doubles.length - i - 1]) > maxSum) {
                        maxSum = doubles[i] + doubles[doubles.length - i - 1];
                    }
                }

                System.out.println("Max sum: " + maxSum);
            }

            case 8 -> {
                //8. Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из
                //исходной те члены, которые равны min(a1, a2, ..., an).
                int [] array = new int[]{3, 1, 2, 3, 1, 3, 5, 2, 1, 2, 5, 1, 3, 2, 1};
                int min = array[0];
                int minCount = 0;

                System.out.println("Initial array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

                for (int i = 0; i < array.length; i++) {
                    if (min > array[i]) {
                        min = array[i];
                    }
                }

                for (int element: array) {
                    if (element == min) {
                        minCount++;
                    }
                }

                int [] newArray = new int[array.length - minCount];
                for (int i = 0, j = 0; i < array.length; i++) {
                    if (array[i] != min) {
                        newArray[j] = array[i];
                        j++;
                    }
                }

                System.out.println("\nNew array: ");
                for (int j = 0; j < newArray.length; j++) {
                    System.out.print(newArray[j] + " ");
                }
            }

            case 9 -> {
                //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
                //чисел несколько, то определить наименьшее из них.
                int [] array = new int[]{4, 2, 3, 5, 2, 3, 4, 7, 4, 3, 2};

                System.out.print("Array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

                System.out.println("\nResult: " + getMostPopularNumber(array));
            }

            case 10 -> {
                //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
                //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
                int [] array = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

                System.out.print("Ini array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

                for (int i = 1; i < array.length; i += 2) {
                    array[i] = 0;
                }

                System.out.print("\nNew array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getMostPopularNumber(int[] data) {
        int[] popular = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = data[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = data[i];
            }
            if ((popResult == popular[i]) && (data[i] < valResult)) {
                valResult = data[i];
            }
        }

        return valResult;
    }
}