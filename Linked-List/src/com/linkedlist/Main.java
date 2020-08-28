package com.linkedlist;

public class Main {

    public static void main(String[] args) {
	    LinkedList linkedList = new LinkedList();
	    linkedList.add(10);
	    linkedList.add(11);
	    linkedList.add("john");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(0));
    }
}
