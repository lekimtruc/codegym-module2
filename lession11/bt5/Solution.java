package lession11.bt5;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.displayQueue();
        System.out.println("--------");

        queue.deQueue();
        queue.displayQueue();
    }
}
