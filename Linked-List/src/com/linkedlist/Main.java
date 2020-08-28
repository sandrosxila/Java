package com.linkedlist;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	    linkedList.add(10);
	    linkedList.add(11);
	    linkedList.add(12);
	    linkedList.popHead();
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(0));
        linkedList.add(124);
        linkedList.add(133);
        linkedList.add(22);

        for (Integer x : linkedList){
        	System.out.print(x + " ");
		}

    }
}
