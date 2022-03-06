package singleton.lazy;

/**
 * @author:tyy
 * @date:2022/3/6
 *
 * 懒汉式之线程不安全
 */
public class Singleton1 {

    private static Singleton1 singleton;

    private Singleton1(){}
    public static Singleton1 getInstance() {
        return singleton;
    }
}
