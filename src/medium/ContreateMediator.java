package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:02 2019/6/27
 * @Modified By :
 */
public class ContreateMediator extends  AbstractorMediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod();
        super.c2.selfMethod();

    }

    @Override
    public void doSomething2() {
        super.c2.selfMethod();
        super.c1.selfMethod();
    }
}
