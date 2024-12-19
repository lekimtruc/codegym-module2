package lession10.bt4;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node hoder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        hoder = temp.next;
        temp.next = new Node(element);
        temp.next.next = hoder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if(temp.next != null){
            Node removedNode = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E) removedNode.data;
        }
        return null;
    }

    public boolean remove(Object e){
        Node temp = head;
        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
            if(temp.next == e){
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size(){
        return numNodes;
    }

    public boolean contains(E o){
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            if(temp.next.data == o){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            if (temp == o){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e){
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp = new Node(e);
        numNodes++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst(){
        return (E) head.data;
    }

    public E getLast(){
        Node temp = head;
        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
           temp = temp.next;
        }
        return (E) temp.next.data;
    }

    public void clear(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            numNodes--;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
