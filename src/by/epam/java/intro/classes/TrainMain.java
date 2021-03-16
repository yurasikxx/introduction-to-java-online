package by.epam.java.intro.classes;

import java.util.Arrays;
import java.util.Scanner;

public class TrainMain {
    public static void main(String[] args) {
        Train[] trains = new Train[5];

        trains[0] = new Train("Minsk", 5, "20:37");
        trains[1] = new Train("Moscow", 3, "19:43");
        trains[2] = new Train("Kiev", 6, "14:37");
        trains[3] = new Train("Minsk", 2, "18:42");
        trains[4] = new Train("Barcelona", 7, "00:01");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter train number: ");
        int number = in.nextInt();
        System.out.println(trains[number - 1].toString());

        System.out.println("Train number sort: ");
        Arrays.sort(trains, new Train.NumberComparator());
        System.out.println(Arrays.toString(trains));

        System.out.println("Destination sort: ");
        Arrays.sort(trains, new Train.DestinationComparator());
        System.out.println(Arrays.toString(trains));
    }
}
