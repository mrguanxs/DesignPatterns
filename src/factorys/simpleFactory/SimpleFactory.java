package factorys.simpleFactory;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 10:47
 * 简单工厂
 */
public class SimpleFactory {

    public static void main(String[] args) {
        try {
            //告诉司机开什么车
            Car car = Driver.driverCar("Benz");
            //下命令：开车
            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
