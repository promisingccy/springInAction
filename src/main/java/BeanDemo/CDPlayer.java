package BeanDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName CDPlayer
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 15:39
 * @Version 1.0
 **/
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired //这表明当Spring创建CDPlayerbean的时候，
    // 会通过这个构造器来进行实例化并且会传入一个可设置给CompactDisc类型的bean。
    // 还能用在属性的Setter方法上
    // 同时支持 @Inject 和 @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
