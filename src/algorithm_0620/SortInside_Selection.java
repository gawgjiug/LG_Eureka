package algorithm_0620;

import java.util.Scanner;

public class SortInside_Selection {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        String str = sc.nextLine();

        int arr[] = new int[str.length()];

        for(int i = 0; i<str.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        for(int  i = 0; i<arr.length -1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                 int tmp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = tmp;
                }
            }
        }
        for(int val : arr){
            System.out.print(val);
        }


    }
}
