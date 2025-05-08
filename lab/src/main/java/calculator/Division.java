package calculator;

public class Division {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can not divide by 0");
        }
        return a / b;
    }
}
