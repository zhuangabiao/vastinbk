package com.vast.scp.mark.units.test.thread;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.scp.mark.units.test.thread
 * @ClassName: MyThreadMain
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/25 14:47
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class MyThreadMain {


    public static void main(String[] args) {
        MyRunable rb = new MyRunable("heello Thread1");
        Thread thread = new Thread(rb);
        System.out.println(thread.getState());
        thread.setName("Thread1:");
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

//        MyRunable rb1 = new MyRunable("heello Thread2");
//        Thread thread1 = new Thread(rb1);
//        thread1.start();

        System.out.println(Thread.currentThread().getName() + "----Hello Main Thread");
    }
}
