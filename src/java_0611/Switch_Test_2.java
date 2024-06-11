package java_0611;

import java.util.Scanner;

public class Switch_Test_2 {
    public static void main(String[] args) {

        //1,3,5,7,8,10,12 = 31
        //4,6,11 = 30
        //2 = 28

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = 0;

/*        if(month == 2){
            day = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        }
        else{
            day = 31;
        }
        System.out.println(month + "월달의 마지막 날은 " + day +"일입니다.");*/

        switch (month){

            case 2:
                day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                day = 31;
        }
        System.out.println(month + "월달의 마지막 날은 " + day +"일입니다.");

        /*if 문은 범위를 부여할 수 있지만 switch 문은 범위를 줄 수 없음
        * ex) m < 2 .. */


    }
}
