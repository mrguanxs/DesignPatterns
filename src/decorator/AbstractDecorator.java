package decorator;

import java.math.BigDecimal;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 10:14
 * 装饰模式 以饮料加奶加糖为例
 */
public abstract class AbstractDecorator {

    private String desc = "Unknown";

    public String getDesc() {
        return desc;
    }

    /**
     * 费用
     * @return
     */
    public abstract double cost();

    public static void main(String[] args) {
        AbstractDecorator orange = new OrangeDrink();
        orange = new AddMilk(orange);
        orange = new AddSugar(orange);

        System.out.println(orange.getDesc());
        System.out.println(orange.cost());

        AbstractDecorator apple = new AppleDrink();
        apple = new AddMilk(apple);
        apple = new AddSugar(apple);
        System.out.println(apple.getDesc());
        System.out.println(apple.cost());
    }

}
