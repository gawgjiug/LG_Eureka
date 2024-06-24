package java_0624;

import java.util.HashSet;
import java.util.TreeSet;

public class Tree_Test {
    public static void main(String[] args) {
        //자료 구조 중 set
        // set -> 순서 없이 중복 없이 저장

        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(10);
        hashSet.add(33);

        System.out.println(hashSet);

        /*내부적으로 정렬되어 저장되고 있음.
        * HashSet은 정렬의 보장이 없음
        * 같은 값을 넣어도 하나만 저장됨
        *
        * 그렇다면 정렬을 해주는 것은? -> TreeSet*/

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        System.out.println("____________________");

        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(42);
        treeSet.add(3123);
        treeSet.add(421);

        System.out.println(treeSet);



    }
}
