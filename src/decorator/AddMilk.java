package decorator;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class AddMilk extends AbstractAddSthDecorator {

    private AbstractDrink decorator;

    public AddMilk(AbstractDrink decorator) {
        this.decorator = decorator;
    }

    @Override
    public String getDesc() {
        return decorator.getDesc() + " AddMilk";
    }

    @Override
    public double cost() {
        return decorator.cost() + 0.5;
    }
}
