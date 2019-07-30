package visitor.base;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:31 2019/7/30
 * @Modified By :
 */
public abstract class Element {
    public abstract  void doSomething();
    public abstract  void acces(IVisitor visitor);
}
