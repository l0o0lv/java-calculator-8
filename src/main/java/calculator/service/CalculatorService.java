package calculator.service;

import calculator.model.Calculator;
import calculator.validator.InputValidator;

public class CalculatorService {
    private final InputValidator inputValidator;

    public CalculatorService(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public int calculate(Calculator calculator) {
        inputValidator.validateInput(calculator);
        String s = calculator.getStr();
        if (s == null || s.isBlank()) {
            return 0;
        }
        // 이후 커밋에서 split → sumNumbers 순서로 완성
        return 0;
    }
}
