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
        linkedList.add(133);
        linkedList.add(124);
        linkedList.add(200);
        linkedList.add(32);
        linkedList.add(1424);
        linkedList.add(23535);
        linkedList.add(20330);
        linkedList.add(1324);
        linkedList.add(6);
        linkedList.add(6);
        linkedList.add(6);
        linkedList.add(6);
        linkedList.add(345);
        linkedList.add(22);
        linkedList.add(4);
        linkedList.add(22);
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        for (Integer x : linkedList){
        	System.out.print(x + " ");
		}
        System.out.println();
        linkedList.sort();

        for (Integer x : linkedList){
            System.out.print(x + " ");
        }
        System.out.println();
        linkedList.add(41);
        linkedList.add(42);
        linkedList.add(44);
        linkedList.add(43);
        linkedList.sort();
        for (Integer x : linkedList){
            System.out.print(x + " ");
        }
    }
}
