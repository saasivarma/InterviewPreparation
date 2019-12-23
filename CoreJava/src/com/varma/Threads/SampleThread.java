package com.varma.Threads;

/**
 * Created by varma on 12/22/2019.
 */
public class SampleThread {
    public static void main(String args[]){
        Thread t1 = new Thread(new Thread2());
        t1.start();
        Thread t2 = new Thread1();
        t2.start();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running "+Thread.currentThread().getName()
                        +" created by "+
                        "Runnable Method without Lambda");
                System.out.println("Running "+Thread.currentThread().getId()
                        +" created by "+
                        "Runnable Method without Lambda");
            }
        };
        Runnable r2 = () -> System.out.println("Running "+Thread.currentThread().getName()
                +" created by "+
                "Runnable Method with Lambda");



        Thread t3 = new Thread(r1,"Thread-2");
        t3.start();

        Runnable r3 = () -> {
            System.out.println("Running "+Thread.currentThread().getName()
                    +" created by "+
                    "Runnable Method with Lambda");
            System.out.println("Running "+Thread.currentThread().getId()
                    +" created by "+
                    "Runnable Method with Lambda");
        };


        Thread t4 = new Thread(r2);
        t4.start();
        Thread t5 = new Thread(r3);
        t5.start();
    }


}
class Thread1 extends Thread{

    public void run(){
        System.out.println("Running "+Thread.currentThread().getName()
                +" created by "+
                "extending Thread Class");
        System.out.println("Running "+Thread.currentThread().getId()
                +" created by "+
                "extending Thread Class");
    }

}

class Thread2 implements Runnable{

    public void run(){
        System.out.println("Running "+Thread.currentThread().getName()
                +" created by "+
                "implementing Runnable Interface");
        System.out.println("Running "+Thread.currentThread().getId()
                +" created by "+
                "implementing Runnable Interface");
    }

}