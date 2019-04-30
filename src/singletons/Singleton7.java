package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 16:04
 * 懒汉式（双重锁机制）
 * 优点：线程安全，效率较高，解决了6不完全单例得问题
 * 缺点：写法复杂，JDK<1.5不可用，原因：由于volatile关键字会屏蔽JAVA虚拟机所作的一些代码优化，导致系统运行效率降低，1.5后修复
 */
public class Singleton7 {
    private Singleton7(){}

    private static volatile Singleton7 instance;

    public static Singleton7 getInstance(){
        if (instance == null){
            synchronized (Singleton7.class){
                if (instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}
