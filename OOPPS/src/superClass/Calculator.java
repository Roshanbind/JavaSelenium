package superClass;

public class Calculator {


    void calculate() {
        printResult(); 
        this.printResult();
    }

    void printResult() {
        System.out.println("Result is 100");
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.calculate();
    }
}

