package by.epam.java.intro.classes;

public class Test1 {
    private final int a = 5;
    private final int b = 10;

    public int sum() {
        return a + b;
    }

    public int greatestValue() {
        return Math.max(a, b);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
