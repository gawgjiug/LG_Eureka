package java_0611;

public class For_Test_2 {
    public static void main(String[] args) {

        //짝수의 합

        int sum = 0;
        for (int i = 0; i<=5; i++){

            if(i % 2 == 0) {
                sum += i;
            }
//            sum -= i; if 문에 코드가 한줄이면 중괄호 없앨 수 있고 밑에 있는 코드는 if 문 지나고 무조건 실행함

        }

        System.out.println(sum);


    }
}
