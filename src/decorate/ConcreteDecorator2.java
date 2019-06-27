package decorate;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:02 2019/6/25
 * @Modified By :
 */
public class ConcreteDecorator2 extends  Decorator {
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    private void method2(){
        System.out.println("装饰角色2装饰方法");
    }
    @Override
    protected void doSomething() {
        this.method2();
        super.doSomething();

    }


}
