package observer;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:45 2019/6/24
 * @Modified By :
 */
public class LisiMain {

    public static void main(String[] args){

        //观察者
        Observer lisi=new Lisi();
        Observer zhangsi=new ZhangSi();

        //被观察者
        HanFeiZi hanFeiZi=new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(zhangsi);

        hanFeiZi.haveEat();

        System.out.println("jdk:");
        ////////////////jdk
        HanFeiZi2 hanFeiZi2=new HanFeiZi2();
        hanFeiZi2.haveFun();

    }
}
