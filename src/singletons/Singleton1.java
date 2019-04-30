package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 13:47
 * 静态内部类
 * 优点：线程安全，写法简单，懒加载
 * 原因：静态内部类在Singleton1加载时不会立即实例化，在调用时实例化
 *      类的静态属性只在第一次加载类的时候初始化，JVM帮助我们保证了线程的安全
 */
public class Singleton1 {

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return Instance.SINGLETON;
    }

    private static class Instance{
        private static final Singleton1 SINGLETON= new Singleton1();

    }

}
