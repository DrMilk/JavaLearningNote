package notethread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/7/20.
 *
 * Lock锁
 */
public class WuLock {
        private int i=0;
        private Lock lock=new ReentrantLock();
        public static void main(String[] args) {
            WuLock mine=new WuLock();
            mine.go();
        }
        public void go(){
            Thread thread=new Thread(new Runnable() {

                public void run() {
                    // TODO Auto-generated method stub
                    while(true&&i<50){
                        if(lock.tryLock()){
                            System.out.println("获得了锁");
                            show("threadone");
                        }
                        show("thread");

                    }

                }
            });
            Thread thread1=new Thread(new Runnable() {
                public void run() {
                    while(true&&i<100){
                        if(lock.tryLock()){
                            System.out.println("获得了锁");
                            show("threadone");
                        }
                    }
                }
            });
            thread.start();
            thread1.start();
        }
        public  void show(String s){
            lock.lock();
            i++;
            System.out.println(s+i);
            if(i==50){
                lock.unlock();
            }
        }

}
