package algorithm_0620;

import java.util.Scanner;

public class Insert_Sort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i<arr.length; i++   ){
            arr[i] = sc.nextInt();
        }

        insert(arr,arr.length);


    }

    private static void insert(int[] a, int size) {

        for(int i = 1; i<size; i++){
            int target = a[i];

            /*
            * taeget에 a[1]의 값을 복사
            * 그 전의 원소와 타겟을 비교하고 그 전의 원소가 타겟보다 크다면
            * a[1]에 그 값을 넣어준다.
            *
            * 그리고 j -- 하면 while문 빠져나감 -> j = -1
            * 그리고 타겟의 값을 j + 1한 곳에 삽입
            *
            * i = 2가 돼서
            * target = a[2]
            *

            * */
            int  j = i-1;

            while(j>=0 && target < a[j]){
                a[j + 1] = a[j];
                j--;
            }

            a[j+1] = target;

        }

    }
}
