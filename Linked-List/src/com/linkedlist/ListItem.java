package com.linkedlist;

public class ListItem<T> {
    private T item;
    private ListItem<T> next;

    public void setNext(ListItem<T> next) {
        this.next = next;
    }

    public ListItem<T> getNext() {
        return next;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
