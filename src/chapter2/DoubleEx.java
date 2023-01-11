package chapter2;

public class DoubleEx {
    public static void main(String[] args) {
        // 실수 리터럴 값은 무조건 (기본적으로) double 로 저장이 된다.
        // 그래서 아래 코드를 보면 double 은 괜찮지만, float에서 오류가 발생함을 확인 할 수 있다.
        // 왜냐하면 3.14 리터럴 값은 double 로 저장되는데, float형인 fNum 변수에 저장하려고 하니 오류가 난다.
        // 그래서 해결하기 위해서는 리터럴 값뒤에 F (float형으로 캐스팅) 붙여주면 된다.
        double dNum = 3.14;
        float fNum = 3.14F;
    }
}
