package brige;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:49 2019/7/4
 * @Modified By :
 */
public class RefinedAbstraction extends  Abstreation {
    public RefinedAbstraction(Implementor _implementor) {
        super(_implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImp().doAnything();
    }



}
