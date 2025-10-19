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

    public void validateNumbers(){

    }

    public void strToInt(){

    }

    public void sumNumbers(){

    }

    public void outputResult() {

    }

    //inputString: 사용자의 문자열 입력을 받음
    //strToInt: 문자열을 구분자로 나눠 숫자 배열로 변환
    //validateNumbers: 배열에서 음수가 있는지 검사
    //sumNumbers: 숫자 배열을 합산
    //outputResult: 결과를 출력
}
