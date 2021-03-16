package by.epam.java.intro.classes;

import java.util.Comparator;

public class Train {
    private final String destination;
    private final int number;
    private final String departure;

    public Train(String destination, int number, String departure) {
        this.destination = destination;
        this.number = number;
        this.departure = departure;
    }

    public static class NumberComparator implements Comparator <Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.number - o2.number;
        }
    }

    public static class DestinationComparator implements Comparator <Train> {
        @Override
        public int compare(Train o1, Train o2) {
            if (o1.destination.equals(o2.destination)) {
                return o1.departure.compareTo(o2.departure);
            } else {
            return o1.destination.compareTo(o2.destination);
            }
        }
    }

    @Override
    public String toString() {
        return destination + " " + number + " " + departure;
    }
}