import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Double> circleArea = new ArrayList<>();

        Calculator calculator = new Calculator(arrayList, circleArea);

//        while (true) {
//            System.out.print("첫 번째 숫자를 입력하세요: ");
//            int num1 = sc.nextInt();
//            System.out.print("두 번째 숫자를 입력하세요: ");
//            int num2 = sc.nextInt();
//
//            System.out.print("사칙연산 기호를 입력하세요: ");
//            char operator = sc.next().charAt(0);
//
//            calculator.calculate(num1, num2, operator);
//
//            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//            String comment = sc.next();
//            if (comment.equals("exit")) {
//                break;
//            }
//        }

        while (true) {
            System.out.print("원의 반지름을 입력하세요: ");
            int radius = sc.nextInt();

            calculator.calculateCircleArea(radius);
//            calculator.setCircleArea();   setter가 필요가 없다?

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }

        //test circleInquiryResults
        calculator.circleInquiryResults();
    }
}