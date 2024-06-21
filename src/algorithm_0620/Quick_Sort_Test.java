package algorithm_0620;

import java.util.Scanner;

public class Quick_Sort_Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];


        for(int  i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("정렬 전 배열 :");

        for(int val : arr){
            System.out.print(val + " ");
        }



        QuickSort(arr,0,N -1);

        System.out.println("\n"+"퀵 정렬 후 :");

        for(int sval : arr){
            System.out.print(sval + " ");
        }


    }

    private static void QuickSort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int pivot = arr[(pl + pr) / 2];


        do {
            while(arr[pl] < pivot)pl++;
            while (arr[pr] > pivot)pr--;
            if(pl <= pr)
                swap(arr,pl++,pr--);
        }while(pl <= pr);
            if(left < pr) QuickSort(arr,left,pr);
            if(pl < right) QuickSort(arr,pl,right);


        /*pl은 배열 왼쪽 끝을 가리키고 pr은 배열의 오른쪽 끝을 가리킴
         * x 는 pivot을 말함
         * 반복문 시작 :
         * do while 루프는 pl이 pr 보다 작거나 같은 동안 반복됨
         * do 블록내의 코드가 먼저 실행 되고 while 조건 평가
         * pl이 x 보다 작으면 ++ -> 이 과정이 피벗보다 큰 값을 찾을 때 까지 반복 됨
         * pr이 피벗 값 보다 크면 -- -> 이 과정이 피봇보다 작은 값을 찾을 때 까지 반복됨
         * pl과 pr의 위치가 역전 되는 순간 if문으로 재귀호출 pr이 0아니면 0~ pr 까지 다시 퀵 정렬
         * pl이 right보다 작으면 (인덱스 끝번호가 아니라면) pl~ right까지 다시 퀵 정렬*/

    }

    private static void swap(int[] arr, int idleft, int idright) {

        int tmp = arr[idleft];
        arr[idleft] = arr[idright];
        arr[idright] = tmp;

    }
}
