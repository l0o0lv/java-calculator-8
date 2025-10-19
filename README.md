# java-calculator-precourse

## 클래스 설명
### Controller
- CalculatorController
    - run(): 프로그램을 실행. 입력 받기 → 계산 → 결과 출력 순서로 진행.
    - inputString(): 사용자로부터 입력을 받고, 입력값을 Calculator 객체로 생성.

### Service
- CalculatorService
    - calculate(Calculator): Calculator 객체를 받아 계산 수행. null/공백 검증 후 문자열 분리 및 합산 수행.
    - splitNumber(Calculator): 입력 문자열을 커스텀 구분자 또는 기본 구분자로 분리.
    - customSplit(Calculator, Matcher): 커스텀 구분자를 사용해 문자열 분리.
    - normalSplit(Calculator): 기본 구분자(쉼표, 콜론)로 문자열 분리.
    - sumNumbers(Calculator): 분리된 문자열 배열의 숫자를 합산.
    - validatePositive(String): 문자열을 정수로 변환하고 음수 검증. 음수이거나 숫자가 아닐 경우 예외 발생.

### Model
- Calculator
    - Calculator(String): 입력 문자열을 받아 Calculator 객체 생성.
    - validateNull(): 문자열이 null 또는 공백인지 검증.
    - getStr(): 입력 문자열 반환.
    - setStrArr(String[]): 분리된 문자열 배열 저장.
    - getStrArr(): 분리된 문자열 배열 반환.

### View
- InputView
    - getInput(): 콘솔에서 입력된 문자열 반환.
- OutputView
    - printInputMsg(): 입력 안내 메시지 출력.
    - printAnswerMsg(int): 계산 결과 출력.

### Util
- Constants
    - OUTPUT_SUM_STRING: 입력 안내 메시지 ("덧셈할 문자열을 입력해 주세요.")
    - OUTPUT_ANSWER: 결과 출력 메시지 ("결과 : ")
    - PATTERN_TEXT: 커스텀 구분자를 위한 정규식 패턴 (//(.)\\n(.*))
    - DEFAULT_SEPARATOR_REGEX: 기본 구분자 정규식 ("[,:]")
- ErrorMessages (Enum)
    - NEGATIVE_NUMBER_ERROR: 음수 입력 오류 메시지 ("음수는 입력할 수 없습니다.")
    - ERROR_INPUT: 잘못된 입력 오류 메시지 ("잘못된 입력입니다.")
    - getMessage(): 에러 메시지 반환.

## 기능 목록

1. 문자열 입력
- [x] 덧셈 할 문자열을 입력받는다.
- [x] 입력 값이 비어있거나 null 이면 0을 반환한다.

2. 패턴 분석
- [x] 문자열에 //(.)\\n 패턴이 있다면 커스텀 구분자 분리 메소드로 간다.
- [x] 없다면 기분 구분자 분리로.

3. 문자열 분리
- [x] 커스텀 구분자 분리
    - [x] Matcher 의 첫 번째 그룹을 구분자로, 두 번째 그룹을 나눌 문자열로 선언한다.
    - [x] 문자열을 분리해 String 배열에 삽입한다.

- [x] 기본 구분자 분리
    - [x] 쉼표, 콜론을 사용해 문자열을 분리해 String 배열에 삽입한다.

3. 숫자 합산
- [x] String 배열에서 값을 하나씩 꺼내 int 형으로 변환 후 모두 더한 값을 반환한다.
    - [x] 변환한 값이 음수라면 `IllegalArgumentException`을 발생시키고 프로그램을 종료한다.
    - [x] 잘못된 값이 입력되면 `IllegalArgumentException`을 발생시키고 프로그램을 종료한다.
    - [x] 모두 더한 최종 결과는 `"결과 : 0"` 형식으로 출력한다.
