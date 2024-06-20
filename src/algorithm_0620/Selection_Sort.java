package algorithm_0620;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();

        }

        /*값 입력 주고
        *
        * 0부터 3까지
        * 1부터 4까지
        * 맨 앞 값보다 +1 의 값이 더 크다면
        * 맨 앞의 값을 바꿔준다.
        * 항상 정렬이 된 마지막 값이랑 정렬이 안된 부분에서 첫번 째 값이랑 비교하기 때문에 for문이 이렇게 형성 됨
        * 0~ N-1 까지 N까지 하게 되면 i + 1을 하는 순간 인덱스를 벗어남 error
        * j는 i + 1 (앞의 값)이랑 비교하고 인덱스 끝 번호 까지 진행...*/

        for(int i = 0; i<N-1; i++){
            for(int j= i+1; j<N; j++){
                if(arr[i] > arr[j]){
                  int tmp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = tmp;
                }
                //
            }

        }

        for(int val : arr) {
            System.out.println(val);
        }

    }
}
