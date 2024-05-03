package answer;

import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator {
    public Class<T> type;

    public ArithmeticCalculator(List<Double> results, Class<T> type) {
        super(results);
        this.type = type;
    }

    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public T calculate(T firstNumber, T secondNumber, char symbol) {
        return operatorFactory(symbol).operate(firstNumber, secondNumber);
    }

    private Operator<T> operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADDITION -> new AddOperator(type);
            case SUBTRACT -> new SubtractOperator(type);
            case DIVISION -> new DivideOperator(type);
            case MULTIPLICATION -> new MultiplyOperator(type);
            case MODULO -> new ModOperator(type);
            default -> throw new UnsupportedOperationException("올바른 사칙연산 기호가 아닙니다.");
        };
    }

    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("result = " + result);
        }
    }

    public void printResultGreaterThan(double num) {
        super.getResults().stream()
                .filter(result -> result > num)
                .forEach(result -> System.out.println("연산결과 = " + result));
//              .forEach(System.out::println)

    }
}
