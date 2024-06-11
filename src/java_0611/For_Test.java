package java_0611;

public class For_Test {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i<=5; i++){
            sum += i;
        }

        System.out.println(sum);
        /*자바는 block 단위로 변수를 관리한다. 블록은 중괄호를 말함
        * 선언한 블록을 벗어나게 되면 해당 변수는 사라짐
        * */

    }
}
