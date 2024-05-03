package answer;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;


    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(results);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    public double calculate(int firstNumber, int secondNumber, char symbol) {
        int result = 0;
        switch (symbol) {
            case '+' -> {
                result = addOperator.operate(firstNumber, secondNumber);
            }
            case '-' -> {
                result = subtractOperator.operate(firstNumber, secondNumber);
            }
            case '/' -> {
                if (secondNumber != 0) {
                    result = divideOperator.operate(firstNumber, secondNumber);
                } else {
                    throw new ArithmeticException("분모에는 0을 입력하실 수 없습니다.");
                }
            }
            case '*' -> {
                result = multiplyOperator.operate(firstNumber, secondNumber);
            }
            default -> {
                System.out.println("옯바른 사칙연산 기호를 선택해주세요.");
                throw new UnsupportedOperationException("올바른 사칙연산 기호가 아닙니다.");
            }
        }
        return result;
    }

    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("result = " + result);
        }
    }
}
