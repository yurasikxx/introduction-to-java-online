package by.epam.java.intro.strings;

import java.util.Scanner;

public class StringOrStringBuilder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
                String s = "Hello   there   are     a    lot   of  spaces";
                char[] c = s.toCharArray();
                int max = 0;
                int count = 0;

                for (char i = 0; i < c.length; i++) {
                    if (c[i] == ' ') {
                        count++;
                    }
                    if (count > max) {
                        max = count;
                        count = 0;
                    }
                }

                System.out.println(count);
            }

            case 2 -> {
                //2. В строке вставить после каждого символа 'a' символ 'b'.
                String s = "aaaaaa";
                StringBuilder sb = new StringBuilder();

                for (char c : s.toCharArray()) {
                    sb.append(c).append('b');
                }

                System.out.println(sb);
            }

            case 3 -> {
                //3. Проверить, является ли заданное слово палиндромом.
                StringBuilder stringBuilder = new StringBuilder("madam");

                if (stringBuilder.toString().contentEquals(stringBuilder.reverse())) {
                    System.out.println("Word " + stringBuilder + " is palindrome");
                } else {
                    System.out.println("Word '" + stringBuilder + "' isn't palindrome");
                }
            }

            case 4 -> {
                //4. С помощью функции копирования и операции конкатенации
                // составить из частей слова “информатика” слово “торт”.
                String s = "информатика";
                char[] c = new char[4];

                s.getChars(7, 8, c, 0);
                s.getChars(3, 5, c, 1);
                s.getChars(7, 8, c, 3);

                for (char i = 0; i < c.length; i++) {
                    System.out.print(c[i]);
                }
            }

            case 5 -> {
                //5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
                String s = "alhambra ares gamma";
                char[] a = s.toCharArray();
                int count = 0;

                for (int i = 0; i < a.length; i++) {
                    if (a[i] == 'a') {
                        count++;
                    }
                }

                System.out.println(count);
            }

            case 6 -> {
                //6. Из заданной строки получить новую, повторив каждый символ дважды.
                String s = "SALAM";
                char[] c = s.toCharArray();
                StringBuilder sb = new StringBuilder();

                for (char i = 0; i < c.length; i++) {
                    sb.append(c[i]).append(c[i]);
                }

                System.out.println(sb);
            }

            case 7 -> {
                //7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
                //def", то должно быть выведено "abcdef".
                String s = "abc cde def";
                //s = s.replaceAll("\\s", "");
                int idx;
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    idx = s.indexOf(c, i + 1);
                    if (idx == -1 && c != ' ') {
                        sb.append(c);
                    }
                }

                System.out.println(sb);
            }

            case 8 -> {
                //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
                // Случай, когда самых длинных слов может быть несколько, не обрабатывать.
                String s = "Salam my brothers";
                String[] a = s.split(" ");
                String max = a[0];

                for (int i = 0; i < a.length; i++) {
                    if (a[i].length() > max.length()) {
                        max = a[i];
                    }
                }

                System.out.println(max);
            }

            case 9 -> {
                //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
                //Учитывать только английские буквы.
                String s = "LalalaLALAla";
                int lower = 0;
                int upper = 0;

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        lower++;
                    }
                    if (c >= 'A' && c <= 'Z') {
                        upper++;
                    }
                }

                System.out.println("lowercase: " + lower);
                System.out.println("uppercase: " + upper);
            }

            case 10 -> {
                //10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
                //восклицательным или вопросительным знаком. Определить количество предложений в строке X.
                String x = "Hey guys! What's up? How are you? See you later.";
                char[] chars = {'?', '!', '.'};
                int count = 0;

                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < x.length(); j++) {
                        char c = x.charAt(j);
                        if (c == chars[i]) {
                            count++;
                        }
                    }
                }

                System.out.println(count);
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}