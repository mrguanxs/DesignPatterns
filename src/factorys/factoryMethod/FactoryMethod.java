package factorys.factoryMethod;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 10:46
 * 工厂方法
 * 优点：符合开闭原则，新产品产生不用修改已有代码，只需新加即可
 * 缺点：类爆炸
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Driver driver = new Driver.BenzDriver();
        Car car = driver.driverCar();
        car.drive();
    }
}
