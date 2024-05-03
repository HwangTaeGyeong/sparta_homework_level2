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
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADDITION -> new AddOperator();
            case SUBTRACT -> new SubtractOperator();
            case DIVISION -> new DivideOperator();
            case MULTIPLICATION -> new MultiplyOperator();
            case MODULO -> new ModOperator();
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
