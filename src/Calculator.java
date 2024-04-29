import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrayList;

    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    private ArrayList<Double> circleArea;
    private final static double PI = 3.14;
    // static을 사용하여 공용 데이터로 함으로써 또다른 객체들이 생성되어도 메모리 낭비를 줄이기 위해 사용함
    // final을 통해 값의 변동을 억제함

    /* 생성자 수정 */
    public Calculator(ArrayList<Integer> arrayList, ArrayList<Double> circleArea) {
        this.arrayList = arrayList;
        this.circleArea = circleArea;
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

    /* 원의 넓이를 구하는 메서드 선언*/
    public void calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        double result = radius * radius * PI;
        this.circleArea.add(result);
    }

    // 첫번째 인덱스 삭제 매서드
    public void removeResult() {
        this.arrayList.removeFirst();
    }

    // 컬렌션 요소들 출력 메서드
    public void inquiryResults() {
        System.out.println(this.arrayList.toString());
    }

    // circleArea 컬렌션 요소들 출력 메서드
    public void circleInquiryResults() {
        System.out.println(this.circleArea.toString());
    }

    /* 사칙연산 필드 Getter, Setter */
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    /* 원의 넓이 저장 필드 Getter, Setter */
    public ArrayList<Double> getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(ArrayList<Double> circleArea) {
        this.circleArea = circleArea;
    }
}
