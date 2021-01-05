package week08d04;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark(){
        //Továbbhívok ("delegálok") a CanMark példány felé!
        return canMark.giveMark();
    }

    //Setteren keresztül állítható -> A CanMark interfész valamely implementációjának pareméterként való átadásával!!!
    public void setMood(CanMark canMark) {
        this.canMark = canMark;
    }
}
