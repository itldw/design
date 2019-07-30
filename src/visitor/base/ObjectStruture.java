package visitor.base;

import java.util.Random;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:37 2019/7/30
 * @Modified By :
 */
public class ObjectStruture {

    public static  Element createElement(){
        Random random=new Random();
        int n=random.nextInt(100);
        if(n>50){
            return new Element1();
        }else{
            return new Element2();
        }
    }
}
