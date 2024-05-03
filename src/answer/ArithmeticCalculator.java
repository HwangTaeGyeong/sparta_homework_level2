package answer;

import java.util.List;

public class ArithmeticCalculator extends Calculator{
    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int firstNumber, int secondNumber, char symbol) {
        int result = 0;
        switch (symbol) {
            case '+' -> {
                result = firstNumber + secondNumber;
            }
            case '-' -> {
                result = firstNumber - secondNumber;
            }
            case '/' -> {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("분모에는 0을 입력하실 수 없습니다.");
                }
            }
            case '*' -> {
                result = firstNumber * secondNumber;
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
