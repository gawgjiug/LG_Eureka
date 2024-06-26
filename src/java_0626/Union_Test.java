package java_0626;

import java.util.Scanner;

public class Union_Test {

    static int c,v,e;
    static int [] parent;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        v = sc.nextInt(); //정점 수

        e = sc.nextInt(); // 입력 횟수
        parent = new int[v+1];

        for(int i = 1; i<=v; i++){
            parent[i] = i; //부모 테이블 상에서 부모를 자기 자신으로 초기화
        }

        for(int i = 0; i<e; i++){
            c = sc.nextInt(); //커맨드
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(c == 1){
                printParent(a,b);
            }
            else {
                unionParent(a,b);
            }

        }

    }

    private static void printParent(int a, int b) {

        int left = findParent(a);
        int right = findParent(b);

        if(left == right){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

    /*1로 시작하는 입력에 대해서 $a$와 $b$가 같은 집합에 포함되어 있으면
    "YES" 또는 "yes"를, 그렇지 않다면 "NO" 또는 "no"를 한 줄에 하나씩 출력한다.*/


    private static int findParent(int x) {
        if(x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);

    }

    private static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if(a<b) parent[b] = a;
        else parent[a] = b;

    }
}
