package chapter2;

public class Constant {
    public static void main(String[] args) {

        // 상수 : 변하지 않는 값
        // 상수를 선언할때 사용하는 키워드 : final
        // 상수 변수는 대문자로 보통 씀

        final int MAX_NUM = 100;
        final double PI = 3.14;

        final int STUDENT_NUM = 30;
        int num = 0;
        if(num == STUDENT_NUM){}
        System.out.println("STUDENT_NUM = " + STUDENT_NUM);
    }
}
// 리터럴: 프로그램에서 사용하는 모든 숫자, 값 , 논리값 을 말한다.
// 리터럴에 해당되는 값은 특정 메모리 공간인 상수 풀(constant pool)에 있음.

    // 필요한 경우 상수 풀에서 가져와서 사용한다.
// 상수 풀에 저장할때 정수는 int로 실수는 double 로 저장된다.(기본값)
// 그래서 float num1 = 3.14 는 오류가 발생한다.
//    왜냐하면 리터럴인 3.14 는 실수이다. 위에서 말했듯이 실수는 double로 상수풀에 저장이되어있기 때문에
//        float num1 = 3.14F 로 float 형으로 캐스팅 해줘야된다.
//        (따라서 long 이나 float 값으로 저장해야하는 경우 식별자(L,I,F,f)를 명시해야한다)
