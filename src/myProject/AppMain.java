package myProject;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            arithmeticCalculator.calculate(num1, num2, operator);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }

        arithmeticCalculator.inquiryResults();
        arithmeticCalculator.removeResult();
        arithmeticCalculator.inquiryResults();

        while (true) {
            System.out.print("원의 반지름을 입력하세요: ");
            int radius = sc.nextInt();

            circleCalculator.calculate(radius);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }

        //test circleInquiryResults
        circleCalculator.inquiryResults();
        circleCalculator.removeResult();
        circleCalculator.inquiryResults();
    }
}