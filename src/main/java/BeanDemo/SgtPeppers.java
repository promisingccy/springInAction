package BeanDemo;

import org.springframework.stereotype.Component;
/**
 * @ClassName SgtPeppers
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 14:55
 * @Version 1.0
 **/
@Component //表明该类会作为组件类，并告知Spring要为这个类创建bean
//@Component("ccyBean")  //可以重命名bean标识

public class SgtPeppers implements CompactDisc {
    /**
    * 标题
    */
    private String title = "ccy";
    /**
    * 作者
    */
    private String artist = "ccy";

    public void play() {
        System.out.printf("Playing %s by %s%n", title, artist);
    }
}
