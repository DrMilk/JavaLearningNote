package notedesignmedol;

/**
 * Created by Administrator on 2017/7/31.
 *
 * 适配器设计模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容
 * 性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式
 */
public class WuAdapter {
//    1.类的适配器模式
//
//    public class Source {
//        public void method1() {
//            System.out.println("this is original method!");
//        }
//    }
//    public interface Targetable {
//        /* 与原类中的方法相同 */
//        public void method1();
//        /* 新类的方法 */
//        public void method2();
//    }
//    public class Adapter extends Source implements Targetable {
//        @Override
//        public void method2() {
//            System.out.println("this is the targetable method!");
//        }
//    }
//    public class AdapterTest {
//        public static void main(String[] args) {
//            Targetable target = new Adapter();
//            target.method1();
//            target.method2();
//        }
//    }

//    2.对象的适配器模式
//    基本思路和类的适配器模式相同，只是将 Adapter 类作修改，这次不继承 Source 类，而是持有 Source 类的实
//    例，以达到解决兼容性的问题。
//
//    接口的适配器模式
//    接口的适配器是这样的：有时我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，必须实现该接
//    口的所有方法，这明显有时比较浪费，因为并不是所有的方法都是我们需要的，有时只需要某一些，此处为了解决这
//    个问题，我们引入了接口的适配器模式，借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不
//    public class Wrapper implements Targetable {
//        private Source source;
//        public Wrapper(Source source) {
//            super();
//            this.source = source;
//        }
//        @Override
//        public void method2() {
//            System.out.println("this is the targetable method!");
//        }
//        @Override
//        public void method1() {
//            source.method1();
//        }
//    }
//    public class AdapterTest {
//
//        public static void main(String[] args) {
//            Source source = new Source();
//            Targetable target = new Wrapper(source);
//            target.method1();
//            target.method2();
//        }
//    }
}
