package calculator;

import calculator.controller.CalculatorController;
import calculator.service.CalculatorService;
import calculator.validator.InputValidator;

public class Application {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService(new InputValidator());
        CalculatorController calculatorController = new CalculatorController(calculatorService);
        calculatorController.run();
    }
}
