package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:48
 * 懒汉式（同步方法）
 * 优点：线程安全（加了同步锁），懒加载
 * 缺点：效率太低
 */
public class Singleton5 {

    private Singleton5(){}

    private static Singleton5 instance;

    public static synchronized Singleton5 getInstance(){
        if (instance == null){
            instance = new Singleton5();
        }
        return instance;
    }
}
