package calculator.util;

public enum ErrorMessages {
    NEGATIVE_NUMBER_ERROR("음수는 입력할 수 없습니다."),
    ERROR_INPUT("잘못된 입력입니다.");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
