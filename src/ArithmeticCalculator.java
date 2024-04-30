import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    private final ArrayList<Integer> arrayList;

    public ArithmeticCalculator(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;
        ArithmeticOperator arithmeticOperator = Calculator.calculate(operator);
//        ArithmeticOperator arithmeticOperator = new AddOperator();
        if (arithmeticOperator != null) {
            result = arithmeticOperator.operate(firstNumber, secondNumber);
        }
        this.arrayList.add(result);
    }

    @Override
    public void removeResult() {
        arrayList.removeFirst();
    }

    @Override
    public void inquiryResults() {
        String str = arrayList.toString();
        System.out.println(str);
    }
}