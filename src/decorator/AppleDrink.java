package decorator;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class AppleDrink extends AbstractDrink {

    @Override
    public String getDesc() {
        return "苹果汁";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
