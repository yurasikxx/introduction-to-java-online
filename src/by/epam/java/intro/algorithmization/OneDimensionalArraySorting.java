package by.epam.java.intro.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArraySorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
                //один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
                //дополнительный массив.
                int[] a = new int[]{1, 2, 3, 4, 5, 6};
                int[] b = new int[]{7, 8, 9, 0};
                final int k = 4;
                int count = 0;

                int[] sum = new int[a.length + b.length + 1];

                for (int i = 0; i < sum.length; i++) {
                    if (k > i) {
                        sum[i] = a[i];
                    } else if (k > count) {
                        sum[i] = b[count];
                        count++;
                    } else {
                        sum[i] = a[i - k - 1];
                        //sum[i] = a[i / 2];
                    }
                }

                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
                System.out.println(Arrays.toString(sum));

            }

            case 2 -> {
                //2. Даны две последовательности a1 < a2 < ... < ai и b1 < b2 < b3 < ... < bi. Образовать из них новую последовательность
                //чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
                int[] a = new int[]{1, 4, 6, 8, 10, 13, 53};
                int[] b = new int[]{3, 5, 7, 11, 42};

                int[] sum = new int[a.length + b.length];

                System.arraycopy(a, 0, sum, 0, a.length);
                System.arraycopy(b, 0, sum, a.length, b.length);

                for (int i = sum.length - 1; i > 0 ; i--) {
                    for (int j = 0; j < i; j++) {
                        if (sum[j] > sum[j + 1]) {
                           int temp = sum[j];
                           sum[j] = sum[j + 1];
                           sum[j + 1] = temp;
                        }
                    }
                }
                
                System.out.println(Arrays.toString(sum));
                /*int[] a = new int[]{1, 5, 6, 7};
                int[] b = new int[]{2, 3, 4};

                System.arraycopy(b, 0, a, 1, b.length);
                System.out.println(Arrays.toString(a));*/
            }

            case 3 -> {
                //3. Сортировка выбором. Дана последовательность чисел a1 < a2 < ... < an. Требуется переставить элементы так,
                //чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
                //элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
                //повторяется. Написать алгоритм сортировки выбором.
                int[] array = new int[]{1, 3, 5, 7, 10};

                for (int i = 0; i < array.length; i++) {
                    int maxValue = array[i];
                    int maxIndex = i;
                    for (int j = array.length - 1; j > i + 1 ; j--) {
                        if (maxValue < array[j]) {
                            maxValue = array[j];
                            maxIndex = j;
                        }
                    }
                    if (i != maxIndex) {
                        int temp = array[i];
                        array[i] = array[maxIndex];
                        array[maxIndex] = temp;
                    }
                }

                System.out.println(Arrays.toString(array));
            }

            case 4 -> {
                //4. Сортировка обменами. Дана последовательность чисел a1 < a2 < ... <ai. Требуется переставить числа в
                //порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 Если ai > ai+1, то делается
                //перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
                //Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
                int[] array = new int[]{10, 8, 7, 3, 2, 1};
                int count = 0;

                for (int i = array.length - 1; i > 0 ; i--) {
                    for (int j = 0; j < i; j++) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                            count++;
                        }
                    }
                }

                System.out.println(Arrays.toString(array));
                System.out.println(count);
            }

            case 5 -> {
                //5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., ai. Требуется переставить числа в порядке
                //возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai упорядоченная последовательность, т. е.
                //a1 < a2 < ... <ai. Берется следующее число ai+1
                //и вставляется в последовательность так, чтобы новая
                //последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
                //не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
                //с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
                int[] array = new int[]{10, 4, 2, 5, 3};

                for (int i = 0; i < array.length; i++) {
                    int index = i;
                    int temp = array[i];

                    while (index > 0 && array[index - 1] >= temp) {
                        array[index] = array[index - 1];
                        index--;
                    }

                    array[index] = temp;
                }

                System.out.println(Arrays.toString(array));
            }

            case 6 -> {
                //6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
                //Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1, то продвигаются
                //на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
                //Составить алгоритм этой сортировки.
                int[] array = new int[]{3, 1, 2, 5, 4, 6, 9, 8};

                int i, j, step, temp;

                for (step = array.length / 2; step > 0; step /= 2) {
                    for (i = step; i < array.length; i++) {
                        temp = array[i];
                        for (j = i; j >= step ; j -= step) {
                            if (temp < array[j - step]) {
                                array[j] = array[j - step];
                            } else {
                                break;
                            }
                        }
                        array[j] = temp;
                    }
                }

                System.out.println(Arrays.toString(array));
            }

            case 7 -> {
                //Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ..... <= an и b1 <= b2 <= ..... <= bm.
                // Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ..... <= bm
                // в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
                int[] array1 = new int[]{1, 2, 3, 3, 4, 4, 5, 5, 11};
                int[] array2 = new int[]{-1, 3, 4, 4, 5, 5, 5, 6, 7, 7, 9, 9, 9};

                for (int i = 0; i < array1.length; i++) {
                    boolean flagIns = true;
                    for (int j = 0; j < array2.length; j++) {
                        if (array1[i] < array2[j]) {
                            System.out.println(i + " элемент первого массива вставим до " + j + " элем. второго");
                            flagIns = false;
                            break;
                        }
                    }
                    if (flagIns)
                        System.out.println(i + " элемент первого масс. вставим после последенго элем. второго");
                }
            }

            case 8 -> {
                //8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
                //знаменателю и упорядочивает их в порядке возрастания.
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}