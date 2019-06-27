package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:45 2019/6/27
 * @Modified By :
 */

public abstract class AbstractorMediator {

    protected ContreateColleague c1;
    protected ContreateColleague2 c2;

    public  AbstractorMediator(){
        c1=new ContreateColleague(this);
        c2=new ContreateColleague2(this);
    }
    public abstract void doSomething1();
    public abstract void doSomething2();

    public ContreateColleague getC1() {
        return c1;
    }

    public void setC1(ContreateColleague c1) {
        this.c1 = c1;
    }

    public ContreateColleague2 getC2() {
        return c2;
    }

    public void setC2(ContreateColleague2 c2) {
        this.c2 = c2;
    }

}
