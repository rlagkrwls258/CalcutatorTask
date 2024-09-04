package calculatorLv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operation;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("사칙연산 기호를 입력하세요: ");

        operation = sc.nextLine().charAt(0);
        System.out.println(operation);
    }
}