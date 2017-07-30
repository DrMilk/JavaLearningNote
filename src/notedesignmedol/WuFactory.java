package notedesignmedol;

/**
 * Created by Administrator on 2017/7/23.
 *
 * 工厂方法模式
 工厂方法模式分为三种：普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不
 能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class WuFactory{

}
// 1.普通工厂
//public class WuFactory {
//    public Sender produce(String type) {
//        if ("mail".equals(type)) {
//            return new MailSender();
//        } else if ("sms".equals(type)) {
//            return new SmsSender();
//        } else {
//            System.out.println("请输入正确的类型!");
//            return null;
//        }
//    }
//}
//public interface Sender {
//    public void Send();
//}
//public class MailSender implements Sender {
//    @Override
//    public void Send() {
//        System.out.println("this is mail sender!");
//    }
//}
//public class SmsSender implements Sender {
//    @Override
//    public void Send() {
//        System.out.println("this is sms sender!");
//    }
//}

//2.多个工厂方法模式
//该模式是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
//        而多个工厂方法模式是提供多个工厂方法，分别创建对象。
//public class SendFactory {
//    public Sender produceMail(){
//        return new MailSender();
//    }
//
//    public Sender produceSms(){
//        return new SmsSender();
//    }
//}
//public class FactoryTest {
//    public static void main(String[] args) {
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.produceMail();
//        sender.send();
//    }
//}


//3.静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
//public class SendFactory {
//    public static Sender produceMail(){
//        return new MailSender();
//    }
//
//    public static Sender produceSms(){
//        return new SmsSender();
//    }
//}
//public class FactoryTest {
//    public static void main(String[] args) {
//        Sender sender = SendFactory.produceMail();
//        sender.send();
//    }
//}

//4.抽象工厂模式
//工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修
//        改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工
//        厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
//public interface Provider {
//    public Sender produce();
//}
//-------------------------------------------------------------------------------------
//public interface Sender {
//    public void send();
//}
//-------------------------------------------------------------------------------------
//public class MailSender implements Sender {
//    @Override
//    public void send() {
//        System.out.println("this is mail sender!");
//    }
//}
//-------------------------------------------------------------------------------------
//public class SmsSender implements Sender {
//    @Override
//    public void send() {
//        System.out.println("this is sms sender!");
//    }
//}
//-------------------------------------------------------------------------------------
//public class SendSmsFactory implements Provider {
//    @Override
//    public Sender produce() {
//        return new SmsSender();
//    }
//}
//public class SendMailFactory implements Provider {
//    @Override
//    public Sender produce() {
//        return new MailSender();
//    }
//}
//-------------------------------------------------------------------------------------
//public class Test {
//    public static void main(String[] args) {
//        Provider provider = new SendMailFactory();
//        Sender sender = provider.produce();
//        sender.send();
//    }
//}