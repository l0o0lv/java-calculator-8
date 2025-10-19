package calculator.service;

import calculator.model.Calculator;

public class CalculatorService {
    public void parseNumbers(Calculator calculator){
        if(validateCustom(calculator)) customParse(calculator);
    }

    public boolean validateCustom(Calculator calculator){
//        return calculator.str().startsWith("/");
    }

    public void customParse(Calculator calculator){
//        String separator = String.valueOf(calculator.str().charAt(2));
//        calculator.str() = calculator.str().substring(5);
//        this.strArr = this.str.split(separator);
    }

}
