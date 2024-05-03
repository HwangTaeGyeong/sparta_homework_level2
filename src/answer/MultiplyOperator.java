package answer;

public class MultiplyOperator<T extends Number> implements Operator<T>{
    public final Class<T> type;

    public MultiplyOperator(Class<T> type) {
        this.type = type;
    }
    public T operate(T firstNumber, T secondNumber) {
        double result = firstNumber.doubleValue() * secondNumber.doubleValue();

        return NumberConversion.convertNumberToType(result, type);
    }
}
