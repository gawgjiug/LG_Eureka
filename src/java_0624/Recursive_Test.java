package java_0624;

public class Recursive_Test {
    public static void main(String[] args) {

        rec(0);

    }

    private static void rec(int i) {

        if(i == 100){
            System.out.println("현재 i 값은 " + i + " 입니다");
            return;
        }

        rec(i+1);

    }
}
