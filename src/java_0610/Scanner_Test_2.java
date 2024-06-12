package java_0610;

import java.util.Scanner;

public class Scanner_Test_2 {
    public static void main(String[] args) {

        System.out.println("태어난 연도 4자리를 입력>>");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int age = 2024 - Integer.parseInt(s); //형 변환

        System.out.println(age);

    }
}
