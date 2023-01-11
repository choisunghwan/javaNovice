package chapter2;

public class DoubleEx2 {
    //main 괄호 밖에 선언된 변수: 멤버 변수
    int abc;
    public static void main(String[] args) {
        var dNum = 3.14;
        float fNum =3.14F;

        System.out.println("dNum = " + dNum);

        var num = 10;
        System.out.println("num = " + num);

        //아래 num = 3.14 코드에서 오류가 나는 이유는 java에서는 위에 num 변수에 int(정수)를 넣었는데
        // 그 후에 실수를 변수에 넣을 수 없다. 이런 경우에는 '타입 캐스팅'을 해야한다.
        //num = 3.14;

    }
}
