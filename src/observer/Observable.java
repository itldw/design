package observer;

/**
 * 被观察者接口
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:33 2019/6/24
 * @Modified By :
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void  notifyObservers(String content);
}
