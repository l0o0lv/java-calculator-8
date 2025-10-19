package calculator.service;

import calculator.model.Calculator;
import calculator.validator.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static calculator.util.Constants.DEFAULT_SEPARATOR_REGEX;
import static calculator.util.Constants.PATTERN_TEXT;
import static calculator.util.ErrorMessages.ERROR_INPUT;
import static calculator.util.ErrorMessages.NEGATIVE_NUMBER_ERROR;

public class CalculatorService {
    private final InputValidator inputValidator;

    public CalculatorService(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public void calculate(Calculator calculator) {
        inputValidator.validateInput(calculator);
        splitNumber(calculator);
        sumNumbers(calculator);
    }

    private void splitNumber(Calculator calculator) {
        Matcher matcher = Pattern.compile(PATTERN_TEXT).matcher(calculator.getStr());

        if (matcher.find()) {
            // 커스텀 구분자 로직으로 분기
            customSplit(calculator, matcher);
        } else {
            // 기본 구분자(, :)로 분리
            normalSplit(calculator);
        }
    }

    private void customSplit(Calculator calculator, Matcher matcher) {
        String customSeparator = matcher.group(1);  // 예: ";"
        String customText = matcher.group(2);       // 예: "1;2;3"
        calculator.setStrArr(customText.split(customSeparator));
    }

    private void normalSplit(Calculator calculator) {
        calculator.setStrArr(calculator.getStr().split(DEFAULT_SEPARATOR_REGEX));
    }

    private void sumNumbers(Calculator calculator) {
        int sum = 0;
        for (String a : calculator.getStrArr()) {
            int number = validatePositive(a);
            sum += number;
        }
        calculator.setAnswer(sum);
    }

    private int validatePositive(String value){
        try{
            int number = Integer.parseInt(value);
            if(number < 0)
                throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR.getMessage());
            return number;}
        catch (NumberFormatException e){
            throw new IllegalArgumentException(ERROR_INPUT.getMessage());
        }
    }
}
