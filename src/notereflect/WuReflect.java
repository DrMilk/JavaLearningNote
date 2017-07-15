package notereflect;

import notetest.Person;

/**
 * Created by Administrator on 2017/7/14.
 */
public class WuReflect {
    /**
     *  关于 Class ：
     *  1.Class类 是一个类
     *  2.对象照镜子后可以得到的信息：某个类的数据成员名、
     *    方法和构造器、某个类到底实现了哪些接口。
     *  3.对于每个类而言，JRE 都为其保留一个不变的 Class 类型的对象。一个 Class
     *    对象包含了特定某个类的有关信息。
     *  4.Class 对象只能由系统建立对象
     *  5.一个类在 JVM 中只会有一个Class实例
     */
    public void testClass(){
        Class clazz = null;
        //1.得到Class对象
        //1.1直接通过类名 .class的方式得到
        clazz = Person.class;
        //1.2通过对象调用 getClass() 方法来获取
        Person person = new Person();
        person.getClass();
        //1.3通过全类名的方式获取
        String classname = "notetest.Person";
        try {
            Class aClass = Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz);
    }

    /**
     * Class类的newwInstance()方法
     */
    public void testNewInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String classname = "notetest.Person";
        Class aClass = null;
        aClass = Class.forName(classname);
        //利用Class 对象的newInstance() 方法来创建类的一个对象
        //实际是调用的是类的那个 无参构的 构造器！
        //一般的，一个类若声明了带参数的构造器，也要声明一个无参的构造器。
        Object object = aClass.newInstance();
        System.out.println(object);
    }

    /**
     * 获取当前类的父类
     */

    public void testGetSuperClass() throws ClassNotFoundException {
        String classname = "java.lang.String";
        Class clazz = Class.forName(classname);
        Class superclazz = clazz.getSuperclass();
        System.out.println(superclazz);
    }
}
