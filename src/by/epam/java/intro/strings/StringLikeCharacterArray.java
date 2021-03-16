package by.epam.java.intro.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLikeCharacterArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) { //разнести свитч
            case 1 -> {
                //1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
                String[] strings = new String[]{"SomeString", "CamelCase", "SnakeCase"};

                Pattern p = Pattern.compile("\\B([A-Z])");
                for (int i = 0; i < strings.length; i++) {
                    Matcher m = p.matcher(strings[i]);
                    StringBuffer strb = new StringBuffer();
                    while (m.find()) {
                        m.appendReplacement(strb, "_$0");
                    }
                    m.appendTail(strb);
                    strings[i] = strb.toString().toLowerCase();
                }
                System.out.println(Arrays.toString(strings));
            }

            case 2 -> {
                //2. Замените в строке все вхождения 'word' на 'letter'.
                String string = "Microsoft Word or just a word";
                String[] a = string.split(" ");
                for (int i = 0; i < a.length; i++) {
                    if (a[i].equalsIgnoreCase("word")) {
                        a[i] = "letter";
                    }
                }
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
            }

            case 3 -> {
                //3. В строке найти количество цифр.
                String s = "lk3jk432l4j5l4";
                int count = 0;


                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        count++;
                    }
                }

                System.out.println(count);
            }

            case 4 -> {
                //4. В строке найти количество чисел
                String s = "I have 24 bananas, 35 apples and 42 carrots";
                String[] a = s.split(" "); //как из массива строк собрать целую строку обратно
                System.out.println(s);
                int count = 0;

                for (int i = 0; i < a.length; i++) {
                    try {
                        Integer.parseInt(a[i]);
                    } catch (NumberFormatException e) {
                        count++;
                    }
                }

                System.out.println(a.length - count);
            }

            case 5 -> {
                //5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
                //Крайние пробелы в строке удалить.
                String names = "    Java  epam Belarus   Minsk  Merry Christmas    ";
                
                names = names.trim();
                String[] a = names.split(" ");

                for (String string: a) {
                    if (!string.isEmpty()) {
                        System.out.print(string + " ");
                    }
                }
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}
