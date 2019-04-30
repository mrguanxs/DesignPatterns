package singletons;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 16:16
 * 枚举
 * 优点：线程安全，还能防止序列化重新创建对象
 * 缺点：JDK1.5后可用
 */
public enum Singleton8 {
    INSTANCE
}
