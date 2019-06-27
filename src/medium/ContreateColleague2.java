package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:57 2019/6/27
 * @Modified By :
 */
public class ContreateColleague2 extends AbstractorColleague {
    public ContreateColleague2(AbstractorMediator _abstractorMediator) {
        super(_abstractorMediator);
    }


    public void selfMethod(){
        System.out.println("同事2自由方法");
    }

    public void depMethod2(){
        super.abstractorMediator.doSomething2();
    }
}
