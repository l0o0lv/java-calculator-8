package calculator.validator;

import calculator.model.Calculator;

public class InputValidator {

    public void validateInput(Calculator calculator){
        validateNull(calculator);
    }
    public void validateNull(Calculator calculator){
        if(calculator.validateNull()){
            throw new IllegalArgumentException("입력값이 null 이거나 빈 문자열입니다.");
        }
    }
}
