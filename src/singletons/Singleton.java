package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 11:01
 * 单例模式
 * 内部类在外部类加载时不会加载
 */
public class Singleton {

    static {
        System.out.println("out static");
    }
    public Singleton(){
        System.out.println("out constract");
    }

    public class A{
        public A(){
            System.out.println("inner constract");
        }
    }

    public static class B{
        public B(){
            System.out.println("inner static constract");
        }
        static {
            System.out.println("inner static");
        }
    }
}
