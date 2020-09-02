package com.linkedlist;

import java.util.Iterator;

public class LinkedList<T extends Comparable<T>> implements Iterable<T> {

    private ListItem<T> head;
    private ListItem<T> tail;
    private int size;

    LinkedList() {
        this.head = new ListItem<>();
        this.size = 0;
    }

    public ListItem<T> getHead() {
        return head.getNext();
    }

    public ListItem<T> getTail() {
        return tail;
    }

    public T head() {
        return head.getNext().getItem();
    }

    public T tail() {
        return tail.getItem();
    }

    private boolean checkIndex(int index){
        return index < this.size();
    }

    public void add(T item) {
        if (this.size() == 0) {
            tail = new ListItem<T>(item);
            head.setNext(tail);
        } else {
            tail.setNext(new ListItem<T>(item));
            tail = tail.getNext();
        }
        size++;
    }

    public void addFront(T item) {
        ListItem<T> newListItem = new ListItem<>();
        newListItem.setItem(item);
        newListItem.setNext(head.getNext());
        head.setNext(newListItem);
        size++;
    }

    T get(int index) {
        if(checkIndex(index) == false){
            try {
                throw new Exception("index out of range!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ListItem<T> current = head.getNext();
        int currentIndex = 0;

        while (currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }

        return current.getItem();
    }

    public void erase(int index){
        if(checkIndex(index) == false){
            try {
                throw new Exception("index out of range!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ListItem<T> current = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        this.size = Math.max(this.size - 1, 0);
        current.setNext(current.getNext().getNext());

    }

    int size() {
        return size;
    }

    void popHead() {
        if (size != 0) {
            head.setNext(head.getNext().getNext());
        }
        size = Math.max(0, size - 1);
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }

    public void sort() {
        int segmentSize = 1;
        while (segmentSize <= this.size()) {
            ListItem<T> current = this.head;
            LinkedList<T> left = new LinkedList<>();
            LinkedList<T> right = new LinkedList<>();
            while (current != null) {
                for(int i = 0; i < segmentSize; i++){
                    if(current.getNext()==null) break;
                    left.addFront(current.getNext().getItem());
                    current.setNext(current.getNext().getNext());
                }
                for(int i = 0; i < segmentSize; i++){
                    if(current.getNext()==null) break;
                    right.addFront(current.getNext().getItem());
                    current.setNext(current.getNext().getNext());
                }
                while(right.size()!=0 || left.size()!=0){
                    ListItem<T> newItem = new ListItem<>();
                    if(right.size()!=0 && left.size!=0){
                        if(left.head().compareTo(right.head()) > 0){
                            newItem.setItem(left.head());
                            newItem.setNext(current.getNext());
                            left.popHead();
                            current.setNext(newItem);
                        }
                        else{
                            newItem.setItem(right.head());
                            newItem.setNext(current.getNext());
                            right.popHead();
                            current.setNext(newItem);
                        }
                    }
                    else if(right.size() == 0){
                        newItem.setItem(left.head());
                        newItem.setNext(current.getNext());
                        left.popHead();
                        current.setNext(newItem);
                    }
                    else {
                        newItem.setItem(right.head());
                        newItem.setNext(current.getNext());
                        right.popHead();
                        current.setNext(newItem);
                    }
                }
                for(int i = 0; i < 2 * segmentSize; i++){
                    if(current == null) break;
                    this.tail = current;
                    current = current.getNext();

                }
            }
            segmentSize <<= 1;
        }
    }
}
