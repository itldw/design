package visitor.base;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:34 2019/7/30
 * @Modified By :
 */
public class Element2 extends  Element {

    @Override
    public void doSomething() {
        System.out.println("do myself 2");
    }

    @Override
    public void acces(IVisitor visitor) {
        visitor.visit(this);
    }
}
