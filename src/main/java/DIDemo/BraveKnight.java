package DIDemo;

/**
 * @ClassName BraveKnight
 * @Description //TODO
 * @Author ccy
 * @Date 2019/12/2 11:51
 * @Version 1.0
 **/
public class BraveKnight implements Knight
{
    private Quest quest;//命令
    private Minstrel minstrel;//艺人

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }


    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
