package answer;

public class DivideOperator implements Operator{
    public int operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("분모에는 0을 입력하실 수 없습니다.");
        }
        return firstNumber / secondNumber;
    }
}
