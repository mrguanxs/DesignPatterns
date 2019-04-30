package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:42
 * 懒汉式（线程不安全）
 * 优点：懒加载
 * 缺点：线程不安全
 */
public class Singleton4 {

    private Singleton4(){}

    private static Singleton4 instance;

    public static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
