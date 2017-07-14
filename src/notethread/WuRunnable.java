package notethread;

/**
 * Created by Administrator on 2017/7/11.
 *
 * Runnable 接口中只有一个未实现的 run 方法，实现该接口的类必须重写该方法。
 * Runnable 接口与 Thread 类之间的区别
 * Runnable 接口必须实现 run 方法，而 Thread 类中的run 方法是一个空方法，可以不重写
 * Runnable 接口的实现类并不是真正的线程类，只是线程运行的目标类。要想以线程的方式执行 run 方法，必须依靠 Thread 类
 * Runnable 接口适合于资源的共享
 */
public class WuRunnable implements Runnable {
    private int i=0;
    @Override
    public void run() {
        for (;i<50;i++){
            System.out.println(Thread.currentThread().getName()+i);
            if(i==10){
                System.out.println("到这步了把");
                Thread.yield();
            }
        }
    }
}
