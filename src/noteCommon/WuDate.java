package noteCommon;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/13.
 *
 * Date 封装了时间和日期
 * DateFormat：把日期对象格式化为一个字符串 & 把一个字符串转为一个Date对象
 *  - DateFormat是个抽象类，抽象类获取对象的方式：
 *    1). 创建其子类对象
 *    2). 有的抽象类中提供了静态工厂方法来获取抽象类的实例。
 */
public class WuDate {
    public void testSimpleDateFormat(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        String dateStr = "2017/1/13";
        try {
            Date date1 = dateFormat.parse(dateStr);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void testDate(){
        Date date =new Date();
        System.out.println(date);
    }
    public void testDateFormat(){
        DateFormat dateFormat = DateFormat.
                getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT);
        Date date = new Date();
        String dateStr = dateFormat.format(date);
        System.out.println(dateStr);
    }
}
