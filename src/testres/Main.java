package testres;

import javafx.scene.layout.Priority;
import noteThread.WuRunnable;
import noteThread.WuThread;
import notecollection.*;
import noteexception.WuException;
import noteio.WuFile;
import noteio.Wuio;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        WuRunnable run=new WuRunnable();
        Thread thread=new Thread(run);
        Thread thread1=new Thread(run);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.setName("Thread-one:");
        thread1.setName("-------:");
        thread.start();
        thread1.start();
//        thread1.start();
//        WuThread wuthread = new WuThread("第一个线程");
//        WuThread wuthread1 = new WuThread("第二个线程");
//        wuthread.start();
//        wuthread1.start();
//        wuthread.testThread();
    }


}

