package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:37
 * 饿汉式（静态代码块）
 * 优点：简单，避免线程同步问题
 * 缺点：类加载的时候加载，没有实现LazyLoading,造成内存浪费
 */
public class Singleton3 {
    private Singleton3(){}

    private static Singleton3 instance;

    static {
        instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return instance;
    }
}
