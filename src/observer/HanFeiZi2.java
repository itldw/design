package observer;

import java.util.Observable;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:25 2019/6/24
 * @Modified By :
 */
public class HanFeiZi2  extends Observable implements IHanFeiZi {
    @Override
    public void haveEat() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }
}
