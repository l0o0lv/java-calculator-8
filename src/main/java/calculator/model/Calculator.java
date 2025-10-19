package calculator.model;

public record Calculator(String str,
                         int answer) {
    public Calculator(String str) {
        this(str, 0); // answer 기본값 0
    }

    // null 또는 빈 문자열 검증
    public boolean validateNull() {
        return str == null || str.isBlank();
    }
}
