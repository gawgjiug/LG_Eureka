package java_0621;
import java.util.Arrays;
public class Combination_Test {
    private static int n, r;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    public static void main(String[] args) {
        n = 4;
        r = 2;
        arr = new int[r];
        visited = new boolean[n + 1];
        combination(0,1);
    }
    // 조합
    private static void combination(int cnt, int start) {
        if (cnt == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i + 1); // 오름차순으로 구하면 중복 체크하지 않아도 됨
        }
    }
}

/*i가 1일때 1은 2,3,4 선택가능
* i가 2일때 2는 3,4 선택 가능
* i가 3일때 3은 4 선택
* i가 4일때 4 는 0
*
* 1,2
* 1,3
* 1,4
* 2,3
* 2,4
* 3,4*/

/*초기 호출:

java
코드 복사
combination(0, 1);
cnt = 0, start = 1
r과 같지 않으므로 for 루프에 진입.
첫 번째 반복 (i = 1):

java
코드 복사
arr[0] = 1;
combination(1, 2);
a. combination(1, 2)
cnt = 1, start = 2
r과 같지 않으므로 for 루프에 진입
i. 첫 번째 반복 (i = 2)
java
코드 복사
arr[1] = 2;
combination(2, 3);
####### 1. combination(2, 3)

cnt = 2, r과 같으므로 [1, 2] 출력
return 후 combination(1, 2)로 돌아감
ii. 두 번째 반복 (i = 3)
java
코드 복사
arr[1] = 3;
combination(2, 4);
####### 2. combination(2, 4)

cnt = 2, r과 같으므로 [1, 3] 출력
return 후 combination(1, 2)로 돌아감
iii. 세 번째 반복 (i = 4)
java
코드 복사
arr[1] = 4;
combination(2, 5);
####### 3. combination(2, 5)

cnt = 2, r과 같으므로 [1, 4] 출력
return 후 combination(1, 2)로 돌아감
b. combination(1, 2) 종료, combination(0, 1)로 돌아감
두 번째 반복 (i = 2):
java
코드 복사
arr[0] = 2;
combination(1, 3);
b. combination(1, 3)
cnt = 1, start = 3
r과 같지 않으므로 for 루프에 진입
i. 첫 번째 반복 (i = 3)
java
코드 복사
arr[1] = 3;
combination(2, 4);
####### 4. combination(2, 4)

cnt = 2, r과 같으므로 [2, 3] 출력
return 후 combination(1, 3)로 돌아감
ii. 두 번째 반복 (i = 4)
java
코드 복사
arr[1] = 4;
combination(2, 5);
####### 5. combination(2, 5)

cnt = 2, r과 같으므로 [2, 4] 출력
return 후 combination(1, 3)로 돌아감
c. combination(1, 3) 종료, combination(0, 1)로 돌아감
세 번째 반복 (i = 3):
java
코드 복사
arr[0] = 3;
combination(1, 4);
c. combination(1, 4)
cnt = 1, start = 4
r과 같지 않으므로 for 루프에 진입
i. 첫 번째 반복 (i = 4)
java
코드 복사
arr[1] = 4;
combination(2, 5);
####### 6. combination(2, 5)

cnt = 2, r과 같으므로 [3, 4] 출력
return 후 combination(1, 4)로 돌아감
d. combination(1, 4) 종료, combination(0, 1)로 돌아감
네 번째 반복 (i = 4):
java
코드 복사
arr[0] = 4;
combination(1, 5);
d. combination(1, 5)
cnt = 1, start = 5
start가 n보다 크므로 for 루프에 진입하지 않고 종료*/
