package calculator.model;

public class Calculator {
    private final String str;
    private String[] strArr;

    public Calculator(String str) {
        this.str = str;
    }

    // null 또는 빈 문자열 검증
    public boolean validateNull() {
        return str == null || str.isBlank();
    }

    public String getStr() {
        return str;
    }

    public void setStrArr(String[] split) {
        this.strArr = split;
    }

    public String[] getStrArr() {
        return strArr;
    }
}
