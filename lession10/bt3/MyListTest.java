package lession10.bt3;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(12);
        myList.add(11);
        myList.add(10);
        System.out.println(myList.get(0));
        System.out.println(myList.contains(13));


    }
}
