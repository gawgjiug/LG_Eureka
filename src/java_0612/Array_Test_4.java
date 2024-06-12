package java_0612;

import java.util.Scanner;

public class Array_Test_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][3]; //2행 3열
        //행 가로축 열 세로 축

        /*2차원 배열을 생성하게 되면 맨 처음 new int [2]가 먼저 생성됨.
        * 2행의 각 행들이 3개짜리 배열2개를 각각 가리킴 시작 주소를 저장
        * 최종적으로 만들어지는 공간에는 정수형의 기본 값인 0이 저장*/

        int sum = 0;

        for(int i= 0; i<2; i++){

            for(int j =0; j<3; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        }

        System.out.println(sum);

    }
}
