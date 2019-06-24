package observer;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:44 2019/6/24
 * @Modified By :
 */
public class ZhangSi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("张思:"+content);
    }
}
