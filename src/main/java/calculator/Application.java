package calculator;

import calculator.controller.CalculatorController;
import calculator.validator.InputValidator;

public class Application {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();
        CalculatorController calculatorController = new CalculatorController(inputValidator);
        calculatorController.run();
    }
}
