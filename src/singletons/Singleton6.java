package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:58
 * 懒汉式（同步代码块）
 * 优点：解决了5效率低得问题，线程安全
 * 缺点：不能完全保证单例
 */
public class Singleton6 {
    private Singleton6(){}

    private static Singleton6 instance;

    public static Singleton6 getInstance(){
        if (instance == null){
            synchronized (Singleton6.class){
                instance = new Singleton6();
            }
        }
        return instance;
    }
}
