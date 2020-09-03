package com.company;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_RESET;

public class Main {

    public static void main(String[] args) {
//        main thread
        System.out.println(ANSI_RESET + "Hello From the Main Thread.");
//        another thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
//        main thread
        System.out.println(ANSI_RESET + "Hello Again From the Main Thread.");
//        anonymous thread
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello From Anonymous Thread.");
            }
        }.run();
//        main thread
        System.out.println(ANSI_RESET + "Last Line of the Main Thread");
    }
}
