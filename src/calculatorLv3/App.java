package calculatorLv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<Double>();

        double a,b;
        char operation;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");

            operation = sc.nextLine().charAt(0);

            System.out.println("결과: " + calc.calculate(operation,a,b));

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)(최근 결과값 삭제는 remove) : ");
            String exit = sc.nextLine();

            if(exit.equals("exit")) {
                break;
            } else if (exit.equals("remove")) {
                calc.removeList();
            }
        }

        for( Line<Double> line : calc.getResultList() ){
            System.out.println(line.toString());
        }

    }
}