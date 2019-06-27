package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:48 2019/6/27
 * @Modified By :
 */
public abstract class AbstractorColleague {

    protected   AbstractorMediator abstractorMediator;
    //约束中介者
    public AbstractorColleague(AbstractorMediator _abstractorMediator){
        this.abstractorMediator=_abstractorMediator;
    }


}
