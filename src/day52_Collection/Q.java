package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();//first in first out --> FIFO

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");

        System.out.println(q);  //[A, B, C, D, E]

        String str = q.poll(); // A -->ilk yazilani remove yapiyor

        System.out.println(str); //A

        System.out.println(q); //[B, D, C, E] ilk yazilani remove yapiyor


    }
}
