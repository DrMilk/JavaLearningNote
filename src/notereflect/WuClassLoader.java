package notereflect;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/14.
 *
 * 类装载器是用来把类(class)装载进 JVM 的。JVM 规范定义了两种类型的类装载器：
 * 启动类装载器(bootstrap)和用户自定义装载器(user-defined class loader)。
 * JVM在运行时会产生3个类加载器组成的初始化加载器层次结构
 *
 * -引导类加载器：用C++编写的，是JVM自带的类装载器，负责Java平台核心库，
 *  用来装载核心类库。该加载器无法直接获取
 * -扩展类加载器：负责jdk_home/lib/ext目录下的jar包或 –D java.ext.dirs
 *  指定目录下的jar包装入工作库
 * -系统类加载器：负责java –classpath 或 –D java.class.path
 *  所指的目录下的类与jar包装入工作
 */
public class WuClassLoader {
    public void testClassLoader() throws ClassNotFoundException {
        //1.获取一个系统的类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //2.获取系统加载器的父类加载器
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        //3.获取扩展类加载器的父类加载器
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        //4.测试当前类由哪个类加载器进行加载：
        classLoader = Class.forName("notetest.Person").getClassLoader();
        System.out.println(classLoader);

        //5.测试JDK 提供的Object 类由哪个类加载器负责加载
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //6.关于类加载器的一个主要方法。
        InputStream in = null;
        in = this.getClass().getClassLoader().getResourceAsStream("notetest\\Person");
        System.out.println(in);


    }
}
