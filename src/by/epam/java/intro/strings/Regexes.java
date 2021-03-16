package by.epam.java.intro.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regexes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of task: ");
        byte task = in.nextByte();

        switch (task) {
            case 1 -> {
                //Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
                //операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
                //отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
                //алфавиту.
                String text = "Girl quit if case mr sing as no have. In expression an solicitude principles in do.\n " +
                        "Sitting hearted on it without me. Any delicate you how kindness horrible outlived servants.\n " +
                        "He in sportsman household otherwise it perceived instantly. Equally he minutes my hastily.\n " +
                        "Any delicate you how kindness horrible outlived servants. We me rent be.\n" +
                        "\n" +
                        "Strictly numerous outlived kindness whatever on we no on addition. Equally he minutes my hastily.\n " +
                        "Is inquiry no he several excited am. Polite do object at passed it is.\n " +
                        "Limits far yet turned highly repair parish talked six.\n " +
                        "He in sportsman household otherwise it perceived instantly.\n " +
                        "Expression alteration entreaties mrs can terminated estimating.";

                System.out.print("Enter number of operation (1 - 3): ");
                byte operation = in.nextByte();

                if (operation == 1) {
                    int sentenceQty1 = 0;
                    int sentenceQty2 = 0;
                    String[] a = text.split("\n\n");

                    for (int i = 0; i < a.length; i++) {
                        Pattern pattern = Pattern.compile("\\p{Punct}");
                        Matcher matcher = pattern.matcher(a[i]);
                        while (i == 0 && matcher.find()) {
                            sentenceQty1++;
                        }
                        while (i == 1 && matcher.find()) {
                            sentenceQty2++;
                        }
                    }

                    System.out.println("Quantity of sentences in 1 paragraph: " + sentenceQty1);
                    System.out.println("Quantity of sentences in 2 paragraph: " + sentenceQty2);
                }

                if (operation == 2) {
                    Pattern pattern = Pattern.compile("\\p{Punct}");
                    Matcher matcher = pattern.matcher(text);

                    while (matcher.find()) {
                        String[] a = text.split(" ");
                        for (int i = 0; i < a.length; i++) {
                            for (int j = 0; j < a.length - 1 - i ;j++) {
                                if (a[j].length() > a[j + 1].length()) {
                                    String temp = a[j];
                                    a[j] = a[j + 1];
                                    a[j + 1] = temp;
                                }
                            }
                        }

                        for (String string: a) {
                            System.out.print(string + " ");
                        }
                    }
                }
            }

            default -> throw new IllegalArgumentException("There is no such task: " + task);
        }
    }
}