package decorate;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 16:03 2019/6/25
 * @Modified By :
 */
public class DecorateMain {

    public static  void main(String[] args){
        Component  component=new ConreateComponent();
        component=new ConcreteDecorator1(component);
        component=new ConcreteDecorator2(component);
        component.doSomething();

    }
}
