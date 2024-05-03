package answer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        int count = 0;
        String comment;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요:");
            char symbol = sc.next().charAt(0);

            int result = 0;
            try {
                result = calculator.calculate(firstNumber, secondNumber, symbol);
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }

//           calculator.results 부분이 private로 인해 접근을 못하므로, getResults()사용
            if (count >= 10) {
                calculator.getResults().remove(0);
                calculator.getResults().add(result);
            } else {
                calculator.getResults().add(result);
                count++;
            }

            System.out.println("result = " + result);
            System.out.println("arrayList.toString() = " + calculator.getResults().toString());


            System.out.println("저장된 결과를 제거하시겠습니까? (remove 입력 시 조회)");
            if (Objects.equals(sc.next(), "remove")) {
                calculator.removeResult(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (Objects.equals(sc.next(), "inquiry")) {
                calculator.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }


    }
}