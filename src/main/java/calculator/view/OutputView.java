package calculator.view;

import static calculator.util.Constants.OUTPUT_ANSWER;
import static calculator.util.Constants.OUTPUT_SUM_STRING;

public class OutputView {
    public static void printInputMsg(){
        System.out.println(OUTPUT_SUM_STRING);
    }

    public static void printAnswerMsg(int answer){
        System.out.println(OUTPUT_ANSWER + answer);
    }
}
