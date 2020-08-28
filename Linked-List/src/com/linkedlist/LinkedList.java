package com.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private ListItem<T> head;
    private ListItem<T> tail;
    private int size;

    LinkedList(){
        this.tail = new ListItem<>();
        this.head = tail;
        this.size = 0;
    }

    public ListItem<T> getHead() {
        return head;
    }

    public ListItem<T> getTail(){
        return tail;
    }

    void add(T item) {
        ListItem<T> newListItem = new ListItem<>();
        newListItem.setItem(item);
        tail.setNext(newListItem);
        tail = tail.getNext();
        size++;
    }

    T get(int index){

        ListItem<T> current = head;
        int currentIndex = 0;

        while(currentIndex <= index){
            current = current.getNext();
            currentIndex++;
        }

        return current.getItem();
    }

    int size(){
        return size;
    }

    void popHead(){
        if(size != 0){
            ListItem <T> next = head.getNext();
            head = null;
            head = next;
        }
        size = Math.max(0, size - 1);
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
