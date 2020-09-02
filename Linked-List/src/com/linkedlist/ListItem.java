package com.linkedlist;

public class ListItem<T extends Comparable<T>> implements Comparable<T>{
    private T item;
    private ListItem<T> next;

    ListItem(){

    }

    ListItem(T item){
        this.item = item;
    }


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

    @Override
    public int compareTo(T other) {
        return this.getItem().compareTo(other);
    }

    public int compareTo(ListItem<T> other) {
        return this.getItem().compareTo(other.getItem());
    }

}
