package noteThread;

import testres.Person;

/**
 * Created by Administrator on 2017/7/10.
 *
 * 程序（program）是对数据描述与操作的代码的集合，是应用程序执行的脚本。
 * 进程（process）是程序的一次执行过程，是系统运行程序的基本单位。程序是静态的，进程是动态的。系统运行一个程序即是一个进程从创建、运行到消亡的过程。
 * 多任务（multi task）在一个系统中可以同时运行多个程序，即有多个独立运行的任务，每个任务对应一个进程。
 *
 * 线程（thread）：比进程更小的运行单位，是程序中单个顺序的流控制。一个进程中可以包含多个线程。
 * 简单来讲，线程是一个独立的执行流，是进程内部的一个独立执行单元，相当于一个子程序。
 * 一个进程中的所有线程都在该进程的虚拟地址空间中，使用该进程的全局变量和系统资源。
 * 操作系统给每个线程分配不同的CPU时间片，在某一时刻，CPU只执行一个时间片内的线程，多个时间片中的相应线程在CPU内轮流执行。
 *
 */

public class WuThread extends Thread{
    private Person person;
    public WuThread (Person person) {this.person=person;}
    public WuThread (String name){
        super(name);
    }
    @Override
    public void run() {
        super.run();
        String threadName = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(threadName+":"+i);
        }
    }


    /**
     * 关于线程
     * 创建多线程
     * - 创建Thread的子类，重写该类的run方法 ：里面放置的是实际的线程体
     * - 创建Runnable接口的实现类，实现接口中的run方法
     * 调用Thread的Start()方法启动线程，而不是run()方法
     *
     * -新建(New)
     * -可执行(Runnable)
     * -运行(Runnable)
     * -阻塞(Blocking)
     * -死亡(Dead)
     *
     * 线程生命周期相关的几个方法：
     * 1 yeild()：若但前线程调用该方法，则由执行状态变为可运行状态。
     * 2 sleep(): 使当前线程休眠一段时间，以毫秒为单位
     * 3 join(): 在一个线程中调用另外的线程join()方法，使当前线程阻塞，等待另一个线程执行完后再进入可执行状态
     * 4 interrupt(): 将解除线程的堵塞状态
     * 5 isAlive(): 判断当前线程是否处于可运行状态或运行状态
     *
     * 线程优先级
     * - getPriority:获取当前线程的优先级
     * - setPriority:设置当前线程的优先级 参数 1-10
     */
    public void testThread(){
        String threadName = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(threadName+":"+i);
        }
    }
}
