package calculatorLv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,result=0;
        char operation;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");

            operation = sc.nextLine().charAt(0);

            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if(b==0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        break;
                    }
                    result = a / b;
                    break;
            }

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                break;
            }
        }
    }
}