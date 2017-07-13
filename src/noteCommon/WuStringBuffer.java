package noteCommon;

/**
 * Created by Administrator on 2017/7/13.
 *
 * StringBuilder 和 StringBuffer 非常类似，均代表可变的字符序列，而且方法也一样
 * String : 不可变字符序列
 * StringBuilder : 可变字符序列，效率高，线程不安全
 * StringBuffer : 可变字符序列，效率低，线程安全
 */
public class WuStringBuffer {
    public void testStringBuffer(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hellow")
                .append("world")
                .append("!");
        StringBuffer stringBuffer = new StringBuffer("abcde");
        stringBuffer.replace(1,3,"吴振宇");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
