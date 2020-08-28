package com.linkedlist;

public class LinkedList<T> {

    private ListItem<T> head;
    private ListItem<T> tail;

    LinkedList(){
        this.tail = new ListItem<>();
        this.head = tail;
    }

    void add(T item) {
        ListItem<T> newListItem = new ListItem<>();
        newListItem.setItem(item);
        tail.setNext(newListItem);
        tail = tail.getNext();
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
}
