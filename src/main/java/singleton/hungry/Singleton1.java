package singleton.hungry;

/**
 * @author:tyy
 * @date:2022/3/6
 *
 *  饿汉式之静态变量
 */
public class Singleton1 {

    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){}
    public static Singleton1 getInstance() {
        return singleton;
    }
}
