package visitor.base;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:36 2019/7/30
 * @Modified By :
 */
public class BaseMain {
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            Element element=ObjectStruture.createElement();
            element.acces(new Visitor());
        }
    }
}
