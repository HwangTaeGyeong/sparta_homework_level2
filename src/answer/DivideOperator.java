package answer;

public class DivideOperator<T extends Number> implements Operator<T>{
    public final Class<T> type;

    public DivideOperator(Class<T> type) {
        this.type = type;
    }

    public T operate(T firstNumber, T secondNumber) {
        if (secondNumber.doubleValue() == 0) {
            throw new ArithmeticException("분모에는 0을 입력하실 수 없습니다.");
        }
        double result = firstNumber.doubleValue() / secondNumber.doubleValue();

        return NumberConversion.convertNumberToType(result, type);
    }
}
