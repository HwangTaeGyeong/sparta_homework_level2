package answer;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
//    캡슐화 private - 외부에서 직접 호출 x, 간접 접근
    private List<Integer> results = new ArrayList<>();

//    지금 코드에서 이미 객체를 생성했기 때문에 set은 사용하지 않아도 된다.
    public List<Integer> getResults() {
        return results;
    }


    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public int calculate(int firstNumber, int secondNumber, char symbol) {
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
}