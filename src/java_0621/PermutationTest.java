package java_0621;

import java.util.Arrays;

public class PermutationTest {
    private static int n, r;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    public static void main(String[] args) {
        n = 4;//전체개수
        r = 2; // 선택할 갯수
        arr = new int[r]; //선택한 숫자 저장소
        visited = new boolean[n + 1];//숫자 선택 여부 지정
        /*n + 1인 이유?
        * 숫자는 1부터 시작하고 배열은 0부터 시작하기 때문에*/
        permutation(0);
    }//end main()
    // 순열
    private static void permutation(int cnt) {
        if (cnt == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i]==false) {
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }//end if
        }//end for
    }//end permutation()

    /*어떤 알고리즘이냐? 나옴 시험에
    * 백트래킹 알고리즘 : 가능한 모든 경우의 수를 탐색하여 원하는 조건을 만족하는 해를 찾는 방법
    * 주로 순열, 조합, 부분 집합 등을 구할 때 사용 됨*/



    /*1. 첫 번째 호출 permutation(0)
    cnt = 0
    r과 같지 않으므로 for 루프에 진입.


    2. 첫 번째 반복 (i = 1)
    visited[1]이 false이므로 visited[1] = true 설정
    arr[0] = 1 설정
    permutation(1) 호출
    a. permutation(1)
    cnt = 1
    r과 같지 않으므로 for 루프에 진입
    i. 첫 번째 반복 (i = 1)
    visited[1]이 true이므로 건너뜀
    ii. 두 번째 반복 (i = 2)
    visited[2]이 false이므로 visited[2] = true 설정
    arr[1] = 2 설정
    permutation(2) 호출
    ####### 1. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [1, 2] 출력
    return 후 permutation(1)로 돌아감
    visited[2] = false 설정
    iii. 세 번째 반복 (i = 3)
    visited[3]이 false이므로 visited[3] = true 설정
    arr[1] = 3 설정
    permutation(2) 호출
    ####### 2. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [1, 3] 출력
    return 후 permutation(1)로 돌아감
    visited[3] = false 설정
    b. permutation(1) 종료, permutation(0)로 돌아감
    visited[1] = false 설정
    for 루프의 다음 반복으로 넘어감
    3. 두 번째 반복 (i = 2)
    visited[2]이 false이므로 visited[2] = true 설정
    arr[0] = 2 설정
    permutation(1) 호출
    b. permutation(1)
    cnt = 1
    r과 같지 않으므로 for 루프에 진입
    i. 첫 번째 반복 (i = 1)
    visited[1]이 false이므로 visited[1] = true 설정
    arr[1] = 1 설정
    permutation(2) 호출
    ####### 3. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [2, 1] 출력
    return 후 permutation(1)로 돌아감
    visited[1] = false 설정
    ii. 두 번째 반복 (i = 2)
    visited[2]이 true이므로 건너뜀
    iii. 세 번째 반복 (i = 3)
    visited[3]이 false이므로 visited[3] = true 설정
    arr[1] = 3 설정
    permutation(2) 호출
    ####### 4. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [2, 3] 출력
    return 후 permutation(1)로 돌아감
    visited[3] = false 설정
    c. permutation(1) 종료, permutation(0)로 돌아감
    visited[2] = false 설정
    for 루프의 다음 반복으로 넘어감
    4. 세 번째 반복 (i = 3)
    visited[3]이 false이므로 visited[3] = true 설정
    arr[0] = 3 설정
    permutation(1) 호출
    c. permutation(1)
    cnt = 1
    r과 같지 않으므로 for 루프에 진입
    i. 첫 번째 반복 (i = 1)
    visited[1]이 false이므로 visited[1] = true 설정
    arr[1] = 1 설정
    permutation(2) 호출
    ####### 5. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [3, 1] 출력
    return 후 permutation(1)로 돌아감
    visited[1] = false 설정
    ii. 두 번째 반복 (i = 2)
    visited[2]이 false이므로 visited[2] = true 설정
    arr[1] = 2 설정
    permutation(2) 호출
    ####### 6. permutation(2)

    cnt = 2
    r과 같으므로 System.out.println(Arrays.toString(arr)) 실행 [3, 2] 출력
    return 후 permutation(1)로 돌아감
    visited[2] = false 설정
    iii. 세 번째 반복 (i = 3)
    visited[3]이 true이므로 건너뜀
    d. permutation(1) 종료, permutation(0)로 돌아감
    visited[3] = false 설정*/
}