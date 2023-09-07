package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CalculatorController {

    @FXML
    private TextField current_input_display;

    @FXML
    private TextField full_expression_display;

    private String firstOperand = "";
    private String secondOperand = "";
    private String operation = "";
    private boolean justEvaluated = false;


    @FXML
    private void handleNumber(ActionEvent event) {
        if(justEvaluated) {
            resetCalculator();
        }
        Button pressedButton = (Button) event.getSource();
        String value = pressedButton.getText();
        current_input_display.appendText(value);
        full_expression_display.appendText(value);
    }

    private void resetCalculator() {
        firstOperand = "";
        secondOperand = "";
        operation = "";
        current_input_display.clear();
        full_expression_display.clear();
        justEvaluated = false;
    }

    @FXML
    private void handleBinaryOperation(ActionEvent event) {
        // +, -, /, *
        firstOperand = current_input_display.getText();
        Button pressedOperation = (Button) event.getSource();
        operation = pressedOperation.getText();

        // Append to full expression and clear current input
        full_expression_display.appendText(" " + operation + " ");
        current_input_display.clear();
    }

    @FXML
    private void handleUnaryOperation(ActionEvent event) {
        // x^2 and sqrt
        firstOperand = current_input_display.getText();
        Button pressedOperation = (Button) event.getSource();
        operation = pressedOperation.getText();

        // Append to full expression
        full_expression_display.appendText(" " + operation);

        String result = evaluateExpression();
        displayResult(result);
    }

    @FXML
    private void handleEquals() {
        secondOperand = current_input_display.getText();
        String result = evaluateExpression();
        displayResult(result);
        justEvaluated = true;
    }

    private void displayResult(String result) {
        full_expression_display.appendText(" = " + result);
        current_input_display.setText(result);
    }

    private String evaluateExpression() {
        CalculatorLogic calculatorLogic = new CalculatorLogic();

        //TODO implement other operations
        int result = 0;
        switch (operation) {
            case "+":
                result = calculatorLogic.sumOfNumbers(firstOperand, secondOperand);
                break;
            case "-":
                result = calculatorLogic.minusOfNumbers(firstOperand, secondOperand);
                break;
            case "*":
                result = calculatorLogic.timesOfNumbers(firstOperand, secondOperand);
                break;
            case "/":
                result = calculatorLogic.divisionOfNumbers(firstOperand, secondOperand);
                break;
            case "Root":
                result = calculatorLogic.rootOfNumber(firstOperand);
                break;
            default:
                //How can we tell the calculator the user has entered a wrong input?
                break;
        }

        return String.valueOf(result);
    }
}
