package by.epam.java.intro.algorithmization;

import java.util.Scanner;

public class ArraysOfArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
                System.out.print("Enter number of rows: ");
                int n = in.nextInt();
                System.out.print("Enter number of columns: ");
                int m = in.nextInt();

                int [][] matrix = new int[n][m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j += 2) {
                        if (matrix[0][j] > matrix[n - 1][j]) {
                            System.out.println(matrix[i][j]);
                        }
                    }
                }

            }

            case 2 -> {
                //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
                int [][] matrix = new int[][]{{1, 2, 5}, {3, 4, 1}, {6, 2, 3}};

                //1 способ
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length / 2; j++) {
                        System.out.println(matrix[i][i]);
                    }
                }

                System.out.println();

                //2 способ
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (i == j) {
                            System.out.println(matrix[i][j]);
                        }
                    }
                }
            }

            case 3 -> {
                //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
                int [][] matrix = new int[][]{{1, 2, 5}, {3, 4, 1}, {6, 2, 3}};
                final int K = 2;
                final int P = 1;

                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[K][j] + " ");
                }

                System.out.println();

                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][P]);
                }
            }

            case 4 -> {
                //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                final int N = 4;
                int [][] matrix = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i % 2 == 0) {
                            matrix[i][j] = j + 1;
                        } else {
                            matrix[i][j] = N - j;
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 5 -> {
                //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                final int N = 6;
                int [][] matrix = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i > j) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = i + 1;
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 6 -> {
                //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                final int N = 6;
                int [][] matrix = new int[N][N];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if ((i - j > 0 && i + j < N - 1) || (i - j < 0) && i + j > N - 1) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = 1;
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 7 -> {
                //7. Сформировать квадратную матрицу порядка N по правилу:
                final int N = 6;
                double [][] matrix = new double[N][N];
                int positive = 0;

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N);
                        if (matrix[i][j] > 0) {
                            positive++;
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nPositive elements: " + positive);
            }

            case 8 -> {
                //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
                //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
                //пользователь с клавиатуры.
                int [][] matrix = new int[][]{{1, 2, 5}, {3, 4, 1}, {6, 2, 3}};
                int temp;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.print("Enter number of column you want to change: ");
                int first = in.nextInt();
                System.out.print("Enter number of other column: ");
                int other = in.nextInt();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        temp = matrix[i][first];
                        matrix[i][first] = matrix[i][other];
                        matrix[i][other] = temp;
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 9 -> {
                //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
                //столбец содержит максимальную сумму.
                int [][] matrix = new int[][]{{1, 9, 5, 9}, {3, 6, 7, 0}, {6, 5, 8, 9}};
                int sum;
                int col = 0;
                int sumMax = 0;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length + 1; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int j = 0; j < matrix.length + 1; j++) {
                    sum = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        sum += matrix[i][j];
                        if (sum > sumMax) {
                            sumMax = sum;
                            col = j + 1;
                        }
                    }
                }

                System.out.println("Max sum is " + sumMax + " in column " + col);
            }

            case 10 -> {
                //10. Найти положительные элементы главной диагонали квадратной матрицы.
                int [][] matrix = new int[][]{{1, 9, -5}, {-3, 6, 7}, {6, 5, -8}};
                int sum = 0;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (i == j && matrix[i][j] > 0) {
                            sum += matrix[i][j];
                        }
                    }
                }

                System.out.print("Sum of positive elements of the main diagonal: " + sum);
            }

            case 11 -> {
                //11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
                //которых число 5 встречается три и более раз.
                int [][] matrix = new int[10][20];

                System.out.println("Matrix: ");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        matrix[i][j] = (int) (Math.random() * 15);
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.print("Number 5 occurs three and more times in rows: ");
                for (int i = 0; i < 10; i++) {
                    int qty = 0;
                    for (int j = 0; j < 20; j++) {
                        if (matrix[i][j] == 5) {
                            qty++;
                        }
                    }
                    if (qty >= 3) {
                        System.out.print(i + 1 + " ");
                    }
                }
            }

            case 12 -> {
                //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
                int [][] matrix = new int[][]{{3, 8, 1}, {6, 2, 5}, {1, 3, 2}};

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - 1; j++) {
                        for (int k = 0; k < matrix.length - 1; k++) {
                            if (matrix[i][k + 1] < matrix[i][k]) {
                                int tmp = matrix[i][k + 1];
                                matrix[i][k + 1] = matrix[i][k];
                                matrix[i][k] = tmp;
                            }
                        }
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - 1; j++) {
                        for (int k = 0; k < matrix.length - 1; k++) {
                            if (matrix[i][k + 1] > matrix[i][k]) {
                                int tmp = matrix[i][k + 1];
                                matrix[i][k + 1] = matrix[i][k];
                                matrix[i][k] = tmp;
                            }
                        }
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 13 -> {
                //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
                int [][] matrix = new int[][]{{3, 8, 1}, {6, 2, 5}, {1, 3, 2}};

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - 1; j++) {
                        for (int k = 0; k < matrix.length - 1; k++) {
                            if (matrix[k + 1][j] < matrix[k][j]) {
                                int tmp = matrix[k + 1][j];
                                matrix[k + 1][j] = matrix[k][j];
                                matrix[k][j] = tmp;
                            }
                        }
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - 1; j++) {
                        for (int k = 0; k < matrix.length - 1; k++) {
                            if (matrix[k + 1][j] > matrix[k][j]) {
                                int tmp = matrix[k + 1][j];
                                matrix[k + 1][j] = matrix[k][j];
                                matrix[k][j] = tmp;
                            }
                        }
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 14 -> {
                //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
                //единиц равно номеру столбца.
                int [][] matrix;
                final int N = 5;
                final int M = 5;
                matrix = new int[N][M];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (i <= j) {
                            matrix[i][j] = 1;
                        }
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 15 -> {
                //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
                int [][] matrix = new int[][]{{3, 8, 1}, {6, 2, 5}, {1, 3, 2}};
                int max = matrix[0][0];

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (matrix[i][j] > max) {
                            max = matrix[i][j];
                        }
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (matrix[i][j] % 2 != 0) {
                            matrix[i][j] = max;
                        }
                    }
                }

                System.out.println();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            case 16 -> {
                //16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2
                //так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
                //собой. Построить такой квадрат.
                final int n = 3;
                int[][] matrix = new int[n][n];
                int x = n/2;
                int y = matrix.length-1;
                int count = 1;

                while (true){
                    matrix[(matrix.length-1)-y][x] = count;
                    count++;

                    if(x==matrix.length-1) x=-1;
                    if(y>=matrix.length-1) y=-1;
                    y++;
                    x++;
                    if (matrix[matrix.length-1-y][x] != 0) y--;

                    int count1=0;
                    for (int[] array:matrix) {
                        for (int z :array) {
                            if(z == 0) count1++;
                        }
                    }
                    if (count1==0) break;
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}