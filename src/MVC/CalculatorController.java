package MVC;

import Calculate.Addition;
import Calculate.Multiplication;
import Calculate.Operation;
import Calculate.Subtraction;
import Calculate.Division;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.setCalculateButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = view.getNum1();
                double num2 = view.getNum2();
                int choice = view.getOperationChoice();

                Operation selectedOperation = getOperation(choice);
                model.setOperation(selectedOperation);
                double result = model.performCalculation(num1, num2);
                view.setResult(result);
            }
        });
    }

    private Operation getOperation(int choice) {
        Operation[] operations = {
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        };

        if (choice >= 0 && choice < operations.length) {
            return operations[choice];
        } else {
            throw new IllegalArgumentException("Неверный выбор операции.");
        }
    }
}
