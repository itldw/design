package visitor.base;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:40 2019/7/30
 * @Modified By :
 */
public class Visitor implements  IVisitor {
    @Override
    public void visit(Element1 element) {
        element.doSomething();
    }

    @Override
    public void visit(Element2 element) {
        element.doSomething();
    }
}
