package DIDemo;

/**
 * @ClassName Minstrel
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 12:05
 * @Version 1.0
 **/
public class Minstrel {// 游方艺人
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("before ...");
    }

    public void singAfterQuest(){
        stream.println("after ...");
    }
}
