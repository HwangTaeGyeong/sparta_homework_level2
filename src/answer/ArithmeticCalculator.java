package answer;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int firstNumber, int secondNumber, char symbol) {
        return operatorFactory(symbol).operate(firstNumber, secondNumber);
    }

    private Operator operatorFactory(char operator) {
        return switch (operator) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '/' -> new DivideOperator();
            case '*' -> new MultiplyOperator();
            case '%' -> new ModOperator();
            default -> throw new UnsupportedOperationException("올바른 사칙연산 기호가 아닙니다.");
        };
    }

    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("result = " + result);
        }
    }
}
