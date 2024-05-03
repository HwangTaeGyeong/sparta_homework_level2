package answer;

import java.util.List;

public class CircleCalculator extends Calculator {
    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int radius) {
        return 3.14 * radius * radius;
    }

    @Override
    public void inquiryResults() {
        for (Double circleResult : super.getResults()) {
            System.out.println("circleResult = " + circleResult);
        }
    }
}
