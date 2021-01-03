package week08d04;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark(CanMark canMark){
        int mark = canMark.giveMark();
        return mark;
    }
}
