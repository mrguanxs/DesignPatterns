package factorys.simpleFactory;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 17:20
 * 工厂类角色
 */
public class Driver {
    //工厂方法，注意返回类型为抽象产品角色
    public static Car driverCar(String s) throws Exception {
        if ("Benz".equals(s)){
            return new Car.Benz();
        } else if ("Bmw".equals(s)){
            return new Car.Bmw();
        } else if ("Audi".equals(s)){
            return new Car.Audi();
        } else {
            throw new Exception("开不了这车型");
        }
    }
}
