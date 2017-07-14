package notecommon;

/**
 * Created by Administrator on 2017/7/13.
 *
 * 1 String 是不可变量的字符序列
 * 2 关于字符串缓冲池: 直接通过 = 为字符串赋值 ，会先在缓冲池中查找有没有一样的字符串
 * 如果有就把那个引用赋值给字符串变量，否则，会创建一个新的字符串，并把对应的字符串放入到缓冲池中，
 * 3 字符串常用方法
 *  - trim(): 去除前后空格的 方法
 *  - subString(): 求子字符串的方法
 *  - indexOf(): 求指定字符的索引
 *  - charAt(): 指定位置的字符
 *  - contains(): 是否包含字符串
 *  - split(): 把字符串拆分成字符串数组
 *  - equals(): 比较字符串内容是否相等必须使用此方法，而不能直接使用 ==
 * String常用构造
 */
public class WuString {
    public void testString() {
        String name = "吴镇宇";
        String newname = name.replace("镇", "振");
        System.out.println(name);
        System.out.println(newname);
    }

    public void testNewString() {
        String str1 = "hello world";
        String str2 = "hello world";

        System.out.println(str1 == str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        String str3 = new String("abcde");
        String str4 = new String("abcde");
        System.out.println(str3 == str4);
    }
}
