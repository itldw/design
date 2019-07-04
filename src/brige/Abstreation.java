package brige;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:46 2019/7/4
 * @Modified By :
 */
public abstract class Abstreation {

    protected  Implementor implementor;
    public Abstreation(Implementor _implementor){
        this.implementor=_implementor;
    }
    //自身的行为和属性
    public void request(){
        this.implementor.doSomeThing();
    }

    //获得实现化角色
    public Implementor getImp(){
        return implementor;
    }

}
