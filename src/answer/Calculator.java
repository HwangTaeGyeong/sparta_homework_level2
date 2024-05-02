package answer;

import javax.naming.OperationNotSupportedException;

ublic class Calculator {
    public double calculate(int firstNumber, int secondNumber, String symbol) {
        double result = 0;
        switch (symbol) {
            case "+" -> {
                result = firstNumber + secondNumber;
            }
            case "-" -> {
                result = firstNumber - secondNumber;
            }
            case "/" -> {
                if (secondNumber == 0) {
                    result = (double) firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("분모에는 0을 입력하실 수 없습니다.");
                }
            }
            case "*" -> {
                result = firstNumber * secondNumber;
            }
            default -> {
                System.out.println("옯바른 사칙연산 기호를 선택해주세요.");
                throw new UnsupportedOperationException("올바른 사칙연산 기호가 아닙니다.");
            }
        }
        return result;
    }
}