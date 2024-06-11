package java_0611;

public class String_Test_2 {
    public static void main(String[] args) {


        String n = "홍길동";

        System.out.println(n.length());
        System.out.println(n.charAt(0));
        System.out.println(n.charAt(1));
        System.out.println(n.charAt(2));

        System.out.println("---------------------");
        String oldStr = "자바 프로그래밍";
        System.out.println(oldStr.substring(3)); //3~끝까지
        System.out.println(oldStr.substring(0,2)); //0~1까지

        System.out.println("---------------------");

        System.out.println(oldStr.substring(3,5));





    }
}
