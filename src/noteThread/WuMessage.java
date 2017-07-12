package noteThread;

/**
 * Created by Administrator on 2017/7/12.
 *
 * 当一个线程正在使用同步方法时，其他线程就不能使用这个同步方法，而有时涉及一些特殊清空：
 * 当一个线程使用的同步方法中用到某个变量，而此变量又需要其他线程修改后才能符合本线程的需要，
 * 那么可以在同步方法中使用wait()方法
 *
 * 关于线程通讯：
 *  相关方法：wait() , notify() , notifyall()
 *  这些方法在同步方法中调用
 */
public class WuMessage implements Runnable {
    private int fiveCount = 1, tenCount = 0, twentyCount = 0;

    public synchronized void buy() {
        String name = Thread.currentThread().getName();

        //zf:20元
        if ("zf".equals(name)) {
            if (fiveCount < 3) {
                try {
                    System.out.println("张飞必须等待");
                    wait();
                    System.out.println("5元面值"+fiveCount);
                    System.out.println("卖一张票给张飞，找零15");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if ("gy".equals(name)) {
            System.out.println("买一张票给关羽.5元面值"+fiveCount);
            fiveCount++;
        } else if ("lb".equals(name)) {
            System.out.println("买一张票给刘备.5元面值"+fiveCount);
            fiveCount++;
        }
        if(fiveCount==3){
            notifyAll();
        }
    }

    @Override
    public void run() {
        buy();
    }
    public static void main(String agrs[]){
        WuMessage wuMessage = new WuMessage();
        Thread thread1 = new Thread(wuMessage);
        Thread thread2 = new Thread(wuMessage);
        Thread thread3 = new Thread(wuMessage);
        thread1.setName("zf");
        thread2.setName("gy");
        thread3.setName("lb");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}