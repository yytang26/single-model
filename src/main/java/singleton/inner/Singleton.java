package singleton.inner;

/**
 * @author:tyy
 * @date:2022/3/6
 *
 * 静态内部类
 */
public class Singleton {

    private static class Inner {
        private static final Singleton singleton = new Singleton();
    }

    private static Singleton getInstance() {
        return Inner.singleton;
    }
}
