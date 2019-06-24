package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:38 2019/6/24
 * @Modified By :
 */
public class HanFeiZi implements IHanFeiZi,Observable {

    private List<Observer> observers=new ArrayList<>();

    @Override
    public void haveEat() {
        System.out.println("韩非子吃饭了");
        notifyObservers("韩非子吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子娱乐了");
        notifyObservers("韩非子娱乐了");
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {

        for(Observer observer:observers){
            observer.update(content);
        }
    }
}
