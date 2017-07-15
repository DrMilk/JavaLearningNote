package notetest;

import notecommon.WuMath;
import notereflect.WuClassLoader;
import notereflect.WuReflect;

public class Main {

    public static void main(String[] args) {
       WuReflect wuReflect = new WuReflect();
        try {
            wuReflect.testGetSuperClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

