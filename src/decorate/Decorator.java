package decorate;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:57 2019/6/25
 * @Modified By :
 */
public abstract class Decorator extends  Component {

    private Component component=null;
    public  Decorator(Component component){
        this.component=component;
    }

    @Override
    protected void doSomething() {
            this.component.doSomething();
    }
}
