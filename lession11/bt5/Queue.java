package lession11.bt5;

import java.util.LinkedList;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node node = new Node(data);
        if (this.front == null) {
            this.front = this.rear = node;
            this.rear.link = this.front;
            return;
        }
        this.rear.link = node;
        this.rear = node;
        this.rear.link = this.front;
    }

    public void deQueue() {
        if (this.front != null) {
            if (this.front == this.rear) {
                this.front = this.rear = null;
            } else {
                this.front = this.front.link;
                this.rear.link = this.front;
            }
        }
    }

    public void displayQueue() {
        Node temp = front;
        if(temp == null){
            System.out.println("Queue is empty!");
        }else{
            do {
                System.out.println(temp.data);
                temp = temp.link;
            } while (temp != front);
        }
    }
}
