package notetest;

import notecommon.WuMath;
import notereflect.WuClassLoader;
import notereflect.WuReflect;

public class Main {

    public static void main(String[] args) {
        WuClassLoader wuClassLoader = new WuClassLoader();
        try {
            wuClassLoader.testClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

