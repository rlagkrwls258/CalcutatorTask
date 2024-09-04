package calculatorLv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Line<Integer>> resultList = new ArrayList<Line<Integer>>();

    public int calculate(char operation, int a, int b){
        int result = 0;
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

        Line<Integer> newline= new Line<Integer>(""+a+operation+b,result );
        resultList.add(newline);

        return result;
    }

    public List<Line<Integer>> getResultList() {
        return resultList;
    }
    public void removeList(){
        resultList.remove(-1);
    }

}
