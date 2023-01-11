package chapter2;

public class CharacterEx {
    public static void main(String[] args) {
        char ch = 'A'; //2바이트
        System.out.println(ch);
        System.out.println((int)ch);
        
        int ch1 = 66;
        System.out.println("ch1 = " + ch1);
        
        int ch2 = 67;
        System.out.println("ch2 = " + ch2);
        System.out.println("(char)ch2 = " + (char)ch2);
    }
}
