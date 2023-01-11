package chapter2;

public class ImpliciitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        System.out.println("num = " + num);

        long lNum = 10;
        float fNum = lNum;

        System.out.println("fNum = " + fNum);

        double dNum = fNum+num;
        System.out.println("dNum = " + dNum);
    }
}
