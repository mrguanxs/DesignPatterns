package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:32
 * 饿汉式（静态常量）
 * 优点：简单，避免线程同步问题
 * 缺点：类加载的时候加载，没有实现LazyLoading,造成内存浪费
 */
public class Singleton2 {
    private static final Singleton2 SINGLETON = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return SINGLETON;
    }
}
