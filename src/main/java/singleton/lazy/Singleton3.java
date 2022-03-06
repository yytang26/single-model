package singleton.lazy;

/**
 * @author:tyy
 * @date:2022/3/6 懒汉式之同步代码块
 */
public class Singleton3 {

    private static Singleton3 singleton;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (null == singleton) {
            synchronized (Singleton3.class) {
                singleton = new Singleton3();
            }
        }
        return singleton;
    }
}
