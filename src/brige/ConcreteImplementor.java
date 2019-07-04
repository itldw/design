package brige;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:44 2019/7/4
 * @Modified By :
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void doSomeThing() {
        System.out.println("1业务逻辑处理1");
    }

    @Override
    public void doAnything() {
        System.out.println("1业务逻辑处理2");
    }
}
