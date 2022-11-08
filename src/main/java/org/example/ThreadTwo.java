package org.example;

public class ThreadTwo implements Runnable{
    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int i=0;i<99;i++){
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread two: "+ a.getCount());
    }
}
