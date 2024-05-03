package answer;

import java.util.ArrayList;
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

            //배열의 인덱스가 초과할 때 첫번째 데이터 삭제 후 데이터 앞으로 이동 -> arrayList로 변경
            if (count >= 10) {
                calculator.results.remove(0);
                calculator.results.add(result);
            } else {
                calculator.results.add(result);
                count++;
            }

            System.out.println("result = " + result);
            System.out.println("arrayList.toString() = " + calculator.results.toString());

            //arrayList 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            comment = sc.next();
            if (comment.equals("inquiry")) {
                for (int i : calculator.results) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }


    }
}