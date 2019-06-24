package observer;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:42 2019/6/24
 * @Modified By :
 */
public class Lisi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("李斯:"+content);
    }
}
