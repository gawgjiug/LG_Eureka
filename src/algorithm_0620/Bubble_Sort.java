package algorithm_0620;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int arr[] = new int[N];


        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,arr.length);

        for(int val : arr){
            System.out.println(val);
        }

    }

    private static void sort(int[] a, int size) {

        for(int i = 1; i<size; i++){ //round는 배열크기 -1 만큼 진행된다.

            //각 라운드별 비교 횟수는 배열크기 - 현재 라운드를 뺀 만큼 비교한다.
            for(int j = 0; j<size-i; j++){
                /*현재 원소가 다음 원소보다 클 경우 서로 원소의 위치를 교환한다.*/
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                }
            }

        }

    }

    private static void swap(int[] a, int bigger, int smaller) {
        int tmp = a[bigger];
        a[bigger] = a[smaller];
        a[smaller] = tmp;
    }


}
