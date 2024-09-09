package calculatorLv3;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum OperatorType {
    PLUS('+', (num1, num2) -> num1 + num2),
    MINUS('-', (num1, num2) -> num1 - num2),
    MULTIPLY('*', (num1, num2) -> num1 * num2),
    DIVIDE('/', (num1, num2) -> num1 / num2);

    private char operator;
    private BiFunction<Double,Double,Double> func;

    OperatorType(char operator, BiFunction<Double,Double,Double> func){
        this.operator = operator;
        this.func = func;
    }

    public static OperatorType getOperator(char operator){
        return Arrays.stream(values())
                .filter(o -> o.operator == operator )
                .findFirst().orElse(null);
    }

    public double calculate(double num1, double num2){
        return func.apply(num1,num2);
    }

}
