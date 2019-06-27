package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:04 2019/6/27
 * @Modified By :
 */
public class Main {

    public static  void main(String[] args){

        AbstractorMediator mediator=new ContreateMediator();
        ContreateColleague c1=new ContreateColleague(mediator);
        ContreateColleague c2=new ContreateColleague(mediator);
        c1.depMethod1();
        c2.depMethod1();

    }
}
