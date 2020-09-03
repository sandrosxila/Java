package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
//        main thread
        System.out.println(ANSI_RESET + "Hello From the Main Thread.");
//        another thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName ("== Another Thread ==");
        anotherThread.start();
//        main thread
        System.out.println(ANSI_RESET + "Hello Again From the Main Thread.");
//        runnable thread
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
//        anonymous thread
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello From Anonymous Thread.");
            }
        }.start();
//        anonymous runnable
        new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE + "Hello From Anonymous Runnable Thread.");
                try{
                    anotherThread.join(2000);
//                    anotherThread.interrupt();
                    System.out.println(ANSI_PURPLE + "Another Thread terminated or timed out, Anonymous Runnable continues working.");

                } catch (InterruptedException e){
                    System.out.println(ANSI_PURPLE + "Anonymous Runnable Thread can't wait anymore.");
                }

            }
        }).start();
//        main thread
        System.out.println(ANSI_RESET + "Last Line of the Main Thread");
    }
}
