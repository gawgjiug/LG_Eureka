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


    }

    private static void swap(int[] arr, int idleft, int idright) {

        int tmp = arr[idleft];
        arr[idleft] = arr[idright];
        arr[idright] = tmp;

    }
}
