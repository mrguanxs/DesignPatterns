package factorys.factoryMethod;

/**
 * @author mrguanxs@163.com
 * @date 2019/5/5 17:24
 * 抽象工厂角色
 */
public interface Driver {

    public Car driverCar();

    public class BenzDriver implements Driver{
        @Override
        public Car driverCar() {
            return new Car.Benz();
        }
    }

    public class AudiDriver implements Driver{
        @Override
        public Car driverCar() {
            return new Car.Audi();
        }
    }

    public class BmwDriver implements Driver{
        @Override
        public Car driverCar() {
            return new Car.Bmw();
        }
    }
}
