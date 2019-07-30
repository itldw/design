package visitor.base;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:33 2019/7/30
 * @Modified By :
 */
public class Element1 extends  Element {
    @Override
    public void doSomething() {
        System.out.println("do myself 1");
    }

    @Override
    public void acces(IVisitor visitor) {
        visitor.visit(this);
    }
}
