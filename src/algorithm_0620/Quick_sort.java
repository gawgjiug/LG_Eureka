package algorithm_0620;

import java.util.Scanner;

class QuickSortV {
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- 퀵 정렬(배열의 분할 과정을 표시)---//
    static void quickSort(int[] a, int left, int right) {
        int pl = left;                      // 왼쪽 커서
        int pr = right;                     // 오른쪽 커서
        int x = a[(pl + pr) / 2];           // 피벗(가운데 요소)

/*        System.out.printf("a[%d]～a[%d] : {", left, right);
        for (int i = left; i < right; i++)
            System.out.printf("%d , ", a[i]);
        System.out.printf("%d}\n", a[right]);*/

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)  quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);

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

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1);            // 배열 x를 퀵정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}