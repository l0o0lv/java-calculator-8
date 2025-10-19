package calculator.controller;

import calculator.model.Calculator;
import calculator.service.CalculatorService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private static Calculator calculator;
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void run(){
        inputString();
        int answer = calculatorService.calculate(calculator);
        OutputView.printAnswerMsg(answer);
    }

    public static void inputString(){
        OutputView.printInputMsg();
        calculator = new Calculator(InputView.getInput());
    }
}
