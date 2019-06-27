package decorate;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:56 2019/6/25
 * @Modified By :
 */
public class ConreateComponent extends  Component {
    @Override
    protected void doSomething() {
        System.out.println("被装配者方法");
    }
}
