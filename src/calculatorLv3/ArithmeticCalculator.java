package calculatorLv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number> {
    private List<Line<T>> resultList = new ArrayList<Line<T>>();
    public OperatorType operator;


    public T calculate(char operation, T a, T b){

        OperatorType operator = OperatorType.getOperator(operation);
        double result = operator.calculate((Double) a,(Double) b);

        Line<T> newline= new Line<T>(""+a+operation+b, (T)(Double)result );
        resultList.add(newline);

        return (T)(Double)result;
    }

    public List<Line<T>> getResultList() {
        return resultList;
    }
    public void setResultList(List<Line<T>> resultList) {
        this.resultList = resultList;
    }

    public void removeList(){
        resultList.remove(-1);
    }

}
