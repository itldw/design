package medium;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:45 2019/6/27
 * @Modified By :
 */

public abstract class AbstractorMediator {

    protected ContreateColleague c1;
    protected ContreateColleague c2;

    public abstract void doSomething1();
    public abstract void doSomething2();

    public ContreateColleague getC1() {
        return c1;
    }

    public void setC1(ContreateColleague c1) {
        this.c1 = c1;
    }

    public ContreateColleague getC2() {
        return c2;
    }

    public void setC2(ContreateColleague c2) {
        this.c2 = c2;
    }
}
