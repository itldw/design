package brige;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:45 2019/7/4
 * @Modified By :
 */
public class ConcreteImplementor2  implements  Implementor {
    @Override
    public void doSomeThing() {
        System.out.println("2业务逻辑处理1");
    }

    @Override
    public void doAnything() {
        System.out.println("2业务逻辑处理2");
    }
}
