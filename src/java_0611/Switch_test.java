package java_0611;

import java.util.Scanner;

public class Switch_test {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String gender = sc.nextLine();

        switch (gender ){
            case "m" :
                System.out.println("남성");
                break;
            case "f":
                System.out.println("여성");
                break;
            default:
                System.out.println("Somethings wrong");
                break;
        }



    }
}
