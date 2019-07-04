package brige;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:51 2019/7/4
 * @Modified By :
 */
public class BrigeClient {
    public  static  void main(String[] args){

            //定义一个实现化角色
            Implementor imp = new ConcreteImplementor();
            //定义一个抽象化角色
             Abstreation abs = new RefinedAbstraction(imp);
            //执行行文
            abs.request();

    }
}
