import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrayList;

    public Calculator(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void calculate(int firstNumber, int secondNumber, char symbol) {
        int result;
        switch (symbol) {
            case '+' -> {
                result = firstNumber + secondNumber;
                this.arrayList.add(result);
            }
            case '-' -> {
                result = firstNumber - secondNumber;
                this.arrayList.add(result);
            }
            case '/' -> {
                result = firstNumber / secondNumber;
                this.arrayList.add(result);
            }
            case '*' -> {
                result = firstNumber * secondNumber;
                this.arrayList.add(result);
            }
            default -> System.out.println("옯바른 사칙연산 기호를 선택해주세요.");
        }
    }

    public void removeResult() {
        this.arrayList.removeFirst();
    }

    public void inquiryResults() {
        System.out.println(this.arrayList.toString());
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
}
