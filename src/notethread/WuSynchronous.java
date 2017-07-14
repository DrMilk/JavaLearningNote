package notethread;

/**
 * Created by Administrator on 2017/7/12.
 *
 * 线程安全的问题：
 * 多个线程访问一个共享的资源，
 * 使用synchronized 代码块解决线程安全的问题：需要 synchronized 代码块中参照共同的一个对象
 * synchronized关键字确保共享对象在同一时刻只能被一个线程访问，
 * 这种处理机制称为“线程同步”或“线程互斥”。Java中的“线程同步”基于“对象锁”的概念
 */
public class WuSynchronous implements Runnable{
    private int appleCount = 5;
    synchronized boolean getApple(){
        if(appleCount>0){
            /**
             * synchronized(this){ 代码块 }
             */
            appleCount--;
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿走了一个苹果，还剩"+appleCount);
            return true;
        }
        return false;
    }
    @Override
    public void run() {
        boolean flag = getApple();
        while (flag){
            flag = getApple();
        }
        System.out.println(Thread.currentThread().getName()+"线程结束了");
    }
    public static void main(String[] args){
        WuSynchronous runnable = new WuSynchronous();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread.setName("小吴");
        thread1.setName("小植");
        thread.start();
        thread1.start();
    }
}
