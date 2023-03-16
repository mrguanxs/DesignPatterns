package decorator;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class AddSugar extends AbstractAddSth {

    private AbstractDecorator decorator;

    public AddSugar(AbstractDecorator decorator) {
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
