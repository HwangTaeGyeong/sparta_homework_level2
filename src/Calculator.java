
public class Calculator {
    double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double calculate(int firstNumber, int secondNumber, char symbol) {
        switch (symbol) {
            case '+' -> {
                return firstNumber + secondNumber;
            }
            case '-' -> {
                return firstNumber - secondNumber;
            }
            case '/' -> {
                return (double) firstNumber / secondNumber;
            }
            case '*' -> {
                return firstNumber * secondNumber;
            }
            default -> {
                System.out.println("옯바른 사칙연산 기호를 선택해주세요.");
                return 0;
            }
        }
    }
}
