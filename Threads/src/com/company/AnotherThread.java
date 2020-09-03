package com.company;
import static com.company.ThreadColor.ANSI_RED;
public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello From " + this.getName());
        try{
            sleep(3000);
        } catch (InterruptedException e){
            System.out.println(ANSI_RED + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_RED + "Another thread is awake!!!");
    }
}
