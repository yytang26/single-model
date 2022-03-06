package singleton.lock;

/**
 * @author:tyy
 * @date:2022/3/6 双检锁
 */
public class Singleton {

    private Singleton() {
    }

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
