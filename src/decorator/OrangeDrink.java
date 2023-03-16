package decorator;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class OrangeDrink extends AbstractDrink {


    @Override
    public String getDesc() {
        return "橘子汁";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
