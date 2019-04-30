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
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManager(){}

    public static void registerService(String key, Object instance){
        if (!objectMap.containsKey(key)){
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
