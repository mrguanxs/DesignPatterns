package singletons;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 16:20
 * 容器类管理
 * 优点:可用于管理单例
 */
public class SingletonManager {

    //用来存放对象对应关系
    private static Map<String, Object> objectMap = new HashMap<>();

    private static SingletonManager singletonManager = new SingletonManager();

    private SingletonManager(){}

    /**
     * 方式二：优点：一个方法搞定   缺点：必须全类名（待改进），对象必须单例
     * @param name
     * @return
     */
    public static Object getInstance(String name){
        if (name == null){
            name = "singletons.SingletonManager";
        }
        if (!objectMap.containsKey(name)){
            try {
                objectMap.put(name, Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return objectMap.get(name);
    }

    /**
     * 方式一：需要分开写注册和获取
     */
//    public static void registerService(String key, Object instance){
//        if (!objectMap.containsKey(key)){
//            objectMap.put(key, instance);
//        }
//    }
//
//    public static Object getService(String key){
//        return objectMap.get(key);
//    }
    //==============================================================
}
