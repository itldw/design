package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:30 2019/6/24
 * @Modified By :
 */
public class Lisi2  implements Observer {


    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.toString());
        System.out.println(arg.toString());
    }
}
