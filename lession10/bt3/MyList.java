package lession10.bt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private List elements;

    public MyList() {
        elements = new ArrayList<E>(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        elements = new ArrayList<E>(capacity);
    }

    public void add(int index, E element) {
        elements.add(index, element);
    }

    public E remove(int index) {
        elements.remove(index);
        return (E) elements;
    }

    public int size() {
        return elements.size();
    }

    public E clone(){
        List cloneElements = new ArrayList<E>();
        for (int i = 0; i < elements.size(); i++) {
            cloneElements.add(elements.get(i));
        }
        return (E) cloneElements;
    }

    public boolean contains(E o) {
        return elements.contains(o);
    }

    public int indexOf(E o) {
        return elements.indexOf(o);
    }

    public boolean add(E e) {
        return elements.add(e);
    }

    public E get(int i){
        return (E) elements.get(i);
    }

    public void clear(){
        elements.clear();
    }
}
