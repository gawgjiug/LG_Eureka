package java_0626;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getNodeA() {
        return this.nodeA;
    }

    public int getNodeB() {
        return this.nodeB;
    }

    @Override
    public int compareTo(Edge other) {
        return this.distance - other.distance;
    }
}

public class Krusak_Test {
    public static int v,e;
    public static  int [] parent;
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        v = sc.nextInt(); //정점의 수
        e = sc.nextInt(); //간선의 수

        parent = new int[v+1];

        for(int i =1; i<=v; i++){
            parent[i] = i; //부모 초기화
        }
        for(int i = 0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int cost= sc.nextInt();


            edges.add(new Edge(cost,a,b));
        }

        Collections.sort(edges);

        int mstCost = 0;
        int max = 0;

        for(Edge edge : edges){
            int cost = edge.getDistance();
            int a = edge.getNodeA();
            int b =  edge.getNodeB();

            if(findParent(a) != findParent(b)){
                unionParent(a,b);
                mstCost += cost;
                max = Math.max(max,cost);
            }

        }


        System.out.println(mstCost -max);




    }

    private static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if(a<b) parent[b] = a;
        else parent[a] = b;


    }

    private static int findParent(int x) {
        if(x == parent[x] ) return x;
        return parent[x] = findParent(parent[x]);
    }

}
