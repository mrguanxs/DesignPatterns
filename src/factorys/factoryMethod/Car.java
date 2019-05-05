package factorys.factoryMethod;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 17:15
 * 抽象产品角色
 */
public interface Car {
    public void drive();

    /**
     * 具体产品角色
     */
    public class Benz implements Car {
        @Override
        public void drive() {
            System.out.println("drive Benz");
        }
    }

    /**
     * 具体产品角色
     */
    public class Bmw implements Car {
        @Override
        public void drive() {
            System.out.println("drive Bmw");
        }
    }

    /**
     * 具体产品角色
     */
    public class Audi implements Car {
        @Override
        public void drive() {
            System.out.println("drive Audi");
        }
    }
}

