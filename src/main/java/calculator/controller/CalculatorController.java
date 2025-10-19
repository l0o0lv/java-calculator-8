package calculator.controller;

import calculator.model.Calculator;
import calculator.validator.InputValidator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private static Calculator calculator;
    private final InputValidator inputValidator;

    public CalculatorController(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public void run(){
        inputString();
        inputValidator.validateInput(calculator);
    }

    public static void inputString(){
        OutputView.printInputMsg();
        calculator = new Calculator(InputView.getInput());
    }
}
