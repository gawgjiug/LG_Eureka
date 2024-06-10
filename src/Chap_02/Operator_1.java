package Chap_02;

public class Operator_1 {
    public static void main(String[] args) {

/*        int i = 1;
        i = -i;
        System.out.println(i);
        i++;
        i++;
        i = i +1;
        System.out.println(i);

        System.out.println("-------------------");*/

/*        int j = 1;
        int k = j++; //연산 이전에 증가

        *//*변수 ++은 대입 연산 이후에 증가*//*

        System.out.println(j);
        System.out.println(k);*/

        int x = 1;
        int y = ++x + x++ + ++x + x++;

        // 2 + 2 하고 x가 증가 (3)
        // 2 + 2 + 4 + 4

        // 2 + 2 (x 가 3임)
        // 4 + 4 (x가 5됨)


        /*x = 5, y = 3*/
        System.out.println(x);
        System.out.println(y);

        int f = 1;
        int f2 = 2;
        System.out.println((float) f/f2);
        System.out.println(f*1.0/f2);


    }
}
