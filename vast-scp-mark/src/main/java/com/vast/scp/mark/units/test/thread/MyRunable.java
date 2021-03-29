package com.vast.scp.mark.units.test.thread;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.scp.mark.units.test.thread
 * @ClassName: MyRunable
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/25 14:55
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class MyRunable implements Runnable {
    private String name;
    MyRunable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-------" + name);

    }
}
