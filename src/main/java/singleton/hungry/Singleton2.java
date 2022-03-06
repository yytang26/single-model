package singleton.hungry;

/**
 * @author:tyy
 * @date:2022/3/6
 *
 * 饿汉式之静态代码块
 */
public class Singleton2 {

    private Singleton2() {}

    private static Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
