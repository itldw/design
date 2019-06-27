package decorate;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:59 2019/6/25
 * @Modified By :
 */
public class ConcreteDecorator1 extends  Decorator {

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }

    private  void method1(){
        System.out.println("装饰角色1装饰方法");
    }
    @Override
    protected void doSomething() {
        this.method1();
        super.doSomething();

    }


}
