package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guan
 * @Date 2023/3/16
 */
public class Subject {

    private Integer price;

    private List<Observer> observeList = new ArrayList<>();

    public void register(Observer observe){
        if(!observeList.contains(observe)) {
            observeList.add(observe);
        }
    }

    private void notifyObserves(){
        observeList.forEach(t->t.update(price));
    }

    public void setPrice(Integer price) {
        this.price = price;
        notifyObserves();
    }


    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        subject.register(observer1);
        subject.register(observer2);

        subject.setPrice(5);
    }
}
