package org.example;

public class ThreadOne implements Runnable{
    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int i=0;i<98;i++){
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread one: "+ a.getCount());
    }
}
