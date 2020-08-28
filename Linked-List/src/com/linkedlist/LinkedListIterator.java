package com.linkedlist;

import com.linkedlist.LinkedList;
import com.linkedlist.ListItem;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    ListItem<T> current;

    LinkedListIterator(LinkedList<T> linkedList){
        current = linkedList.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getItem();
        current = current.getNext();
        return data;
    }
}
