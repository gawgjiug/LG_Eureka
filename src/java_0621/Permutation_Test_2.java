package java_0621;

import java.util.Arrays;

public class Permutation_Test_2 {
    private static int n, r;
    private static int[] arr; // 원소를 저장할 배열

    /*중복을 포함한 모든 경우의 수 출력*/

    public static void main(String[] args) {
        n = 3;//전체개수
        r = 2; // 선택할 갯수
        arr = new int[r]; //선택한 숫자 저장소


        permutation(0);
    }//end main()
    // 순열
    private static void permutation(int cnt) {
        if (cnt == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {

                arr[cnt] = i;
                permutation(cnt + 1);

        }//end for
    }//end permutation()


    /*per(0) -> i = 1 -> cnt = 1 -> per(1)
    *
    * per(1) -> i = 1 출력 cnt = 2 다시 per (0)  1,1
    *
    * per(0) -> i = 2 -> cnt = 1 -> per(1)
    *
    * per(1) -> i = 1 출력 cnt 2  다시 per (0) 2,1 */

    /*위 알고리즘은 모든 경우의 수를 출력하는 브루트포스임*/


}
