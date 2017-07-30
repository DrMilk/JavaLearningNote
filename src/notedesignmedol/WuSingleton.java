package notedesignmedol;

/**
 * Created by Administrator on 2017/7/22.
 *
 * 单例模式
 *  分为两种 饿汉式  懒汉式
 */
public class WuSingleton {
    //饿汉式
    // 直接创建对象
    public static WuSingleton instance = new WuSingleton();
    // 私有化构造函数
    private WuSingleton() {
    }
    // 返回对象实例
    public static WuSingleton getInstance() {
        return instance;
    }

    }
    /**
     * 懒汉式
     * // 声明变量
     private static volatile WuSingleton singleton2 = null;
     // 私有构造函数
     private WuSingleton() {
     }
     // 提供对外方法
     public static WuSingleton getInstance() {
     if (singleton2 == null) {
     synchronized (WuSingleton.class) {
     if (singleton2 == null) {
     singleton2 = new WuSingleton();
     }
     }
     }
     return singleton2;
     }
     */
