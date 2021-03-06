package notethread;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/8/8.
 *
 * 1) newCachedThreadPool
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
 *
 * 在创建了线程池后，默认情况下，线程池中并没有任何线程，而是等待有任务到来才创建线程去执行任务，除非调用了prestartAllCoreThreads()
 * 或者prestartCoreThread()方法，
 */
public class WuThreadPool {
    public void testNewCachedThreadPool() {
        ExecutorService cachedthreadpool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedthreadpool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }
    //NewFixedThreadPool
    //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。示例代码如下：
    //因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
    //定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()
    public void testNewFixedThreadPool(){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    // newScheduledThreadPool
    //创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下：
    public void testNewScheduledThreadPool(){
        //表示延迟3秒执行。
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        //表示延迟1秒后每3秒执行一次。
        ScheduledExecutorService scheduledThreadPool1 = Executors.newScheduledThreadPool(5);
        scheduledThreadPool1.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }

    // 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
    //结果依次输出，相当于顺序执行各个任务。
    public void testNewSingleThreadExecutor(){
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}