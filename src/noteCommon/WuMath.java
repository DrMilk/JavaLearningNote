package noteCommon;

import java.util.Random;
import static java.lang.Math.*;

/**
 * Created by Administrator on 2017/7/13.
 *
 * Random: 中封装了随机相关的方法
 * Math: 中封装了常用的数学方法
 * 静态导入 基本语法：
 * import static java.lang.Math.*;
 * 导入指定类的静态属性和静态方法
 */
public class WuMath {
   public void testRandom(){
       Random random =new Random();
       System.out.println(random.nextBoolean());
       System.out.println(random.nextInt(2));
   }
   public void testMath(){
       System.out.println(sin(PI/2));
   }
}
