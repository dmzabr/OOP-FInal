package MVC;

import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    private TextField num1Field;
    private TextField num2Field;
    private Choice operationChoice;
    private Button calculateButton;
    private Label resultLabel;

    public CalculatorView() {
        Frame frame = new Frame("Калькулятор");

        Panel panel = new Panel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        Label num1Label = new Label("Первое число:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(num1Label, constraints);

        num1Field = new TextField();
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(num1Field, constraints);

        Label num2Label = new Label("Второе число:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(num2Label, constraints);

        num2Field = new TextField();
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(num2Field, constraints);

        Label operationLabel = new Label("Операция:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(operationLabel, constraints);

        operationChoice = new Choice();
        operationChoice.add("Сложение");
        operationChoice.add("Вычитание");
        operationChoice.add("Умножение");
        operationChoice.add("Деление");
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(operationChoice, constraints);

        calculateButton = new Button("Вычислить");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        panel.add(calculateButton, constraints);

        resultLabel = new Label();
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(resultLabel, constraints);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public double getNum1() {
        return Double.parseDouble(num1Field.getText());
    }

    public double getNum2() {
        return Double.parseDouble(num2Field.getText());
    }

    public int getOperationChoice() {
        return operationChoice.getSelectedIndex();
    }

    public void setResult(double result) {
        resultLabel.setText("Результат: " + result);
    }

    public void setCalculateButtonActionListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
