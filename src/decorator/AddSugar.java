package decorator;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class AddSugar extends AbstractAddSthDecorator {

    private AbstractDrink decorator;

    public AddSugar(AbstractDrink decorator) {
        this.decorator = decorator;
    }

    @Override
    public String getDesc() {
        return decorator.getDesc() + " AddSugar";
    }

    @Override
    public double cost() {
        return decorator.cost() + 0.1;
    }
}
