package myProject;

import java.util.ArrayList;

public abstract class Calculator {
    public abstract void removeResult();
    public abstract void inquiryResults();

    public static ArithmeticOperator calculate(char operate) {
        switch (operate) {
            case '+' -> {
                return new AddOperator();
            }
            case '-' -> {
                return new SubtractOperator();
            }
            case '*' -> {
                return new MultiplyOperator();
            }
            case '/' -> {
                return new DivideOperator();
            }
            default -> {
                return null;
            }
        }
    }

}
