package calculatorLv2;

public class Line<T> {
    String folmula;
    T result;

    public Line(String folmula, T result) {
        this.folmula = folmula;
        this.result = result;
    }

    public String getFolmula() {
        return folmula;
    }
    public void setFolmula(String folmula) {
        this.folmula = folmula;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }
    public String toString(){
        return folmula + " : " + result;
    }
}
