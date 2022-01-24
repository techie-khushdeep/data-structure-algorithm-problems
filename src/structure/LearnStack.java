package structure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnStack {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(50);
        System.out.println(pq);

        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Hello");
        pq1.add("ABC");
        pq1.add("Test");
        System.out.println(pq1);

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(20);
        q1.add(10);
        System.out.println(q1);
    }
}
