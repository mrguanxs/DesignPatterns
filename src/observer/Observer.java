package observer;

import java.util.Random;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 10:27
 * 观察者模式
 */
public class Observer {

    public void update(Integer price){
        System.out.println(this.toString() + "房子降价了,快来买啊,价格:" + price);
        int i = new Random().nextInt(10);
        if(price > i){
            System.out.println(this.toString() + "说太贵了,不低于"+ i + "不买!");
        }else {
            System.out.println(this.toString() + "说真便宜,才"+i+",去看看!");
        }

    }
}
