import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        /* 반복문 시작 */
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            ArrayList<Integer> arrayList = calculator.calculate(num1, num2, operator);
            calculator.setArrayList(arrayList);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }
        /* 반복문 종료 */

        //test inquiryResults
        calculator.inquiryResults();
        calculator.removeResult();
        calculator.inquiryResults();
    }
}