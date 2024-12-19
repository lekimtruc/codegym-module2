package lession10.bt4;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("==== TESTING ====");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
        System.out.println("----------");

        System.out.println(ll.remove(2));
        System.out.println("----------");
        ll.printList();
    }
}
