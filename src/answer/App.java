package answer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator<>(new ArrayList<>(), Double.class);
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        int count = 0;
        String comment;

        while (true) {
            System.out.println("어떤 계산을 하시겠습니까? (1:사칙연산, 2:원의 넓이)");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double secondNumber = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요:");
                char symbol = sc.next().charAt(0);

                double result = 0;
                try {
                    result = arithmeticCalculator.calculate(firstNumber, secondNumber, symbol);
                } catch (Exception e) {
                    System.out.println("e.getMessage() = " + e.getMessage());
                }

                if (count >= 10) {
                    arithmeticCalculator.getResults().remove(0);
                    arithmeticCalculator.getResults().add(result);
                } else {
                    arithmeticCalculator.getResults().add(result);
                    count++;
                }

                System.out.println("result = " + result);
                System.out.println("arrayList.toString() = " + arithmeticCalculator.getResults().toString());

                System.out.println("입력값보다 큰 값들을 조회하시겠습니까? (lambda 입력 시 조회)");
                if (Objects.equals(sc.next(), "lambda")) {
                    System.out.println("기준 값을 입력하세요: ");
                    double num = sc.nextDouble();
                    arithmeticCalculator.printResultGreaterThan(num);
                }

                System.out.println("저장된 결과를 제거하시겠습니까? (remove 입력 시 조회)");
                if (Objects.equals(sc.next(), "remove")) {
                    arithmeticCalculator.removeResult(0);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (Objects.equals(sc.next(), "inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }
            } else {
                System.out.println("반지름을 입력하세요: ");
                int radius = sc.nextInt();

                double area = circleCalculator.calculate(radius);
                circleCalculator.getResults().add(area);
                circleCalculator.inquiryResults();

            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            comment = sc.next();
            if (comment.equals("exit")) {
                break;
            }
        }


    }
}