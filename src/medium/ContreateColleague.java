package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:51 2019/6/27
 * @Modified By :
 */
public class ContreateColleague extends AbstractorColleague {

    public ContreateColleague(AbstractorMediator _abstractorMediator) {
        super(_abstractorMediator);
    }

    public void selfMethod() {
        System.out.println("同事1自己方法");
    }

    //需中介者协调的方法
    public void depMethod1() {
        super.abstractorMediator.doSomething1();
    }

}
