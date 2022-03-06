package singleton.lazy;

/**
 * @author:tyy
 * @date:2022/3/6 懒汉式之线程安全(同步方法)
 */
public class Singleton2 {

    private static Singleton2 singleton;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (null == singleton) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
