package algorithm_0620;

import java.util.Scanner;

public class Recursion_Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x + " 의 팩토리얼은" + factorial(x) + " 입니다.");

    }

    private static int factorial(int x) {

        if(x > 0)   {
            return  x * factorial(x -1);
        }
        else {
            return 1;
        }

    }


}
