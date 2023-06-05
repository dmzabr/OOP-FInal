package MVC;

import Calculate.Operation;

public class CalculatorModel {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double performCalculation(double num1, double num2) {
        return operation.calculate(num1, num2);
    }
}
