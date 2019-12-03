package DIDemo;

/**
 * @ClassName SlayDragonQuest
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 11:58
 * @Version 1.0
 **/
public class SlayDragonQuest implements Quest {//杀龙命令
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("afsaf");
    }
}
