package week03d05;

public class Operation {

    /*Írj egy Operation osztályt, mely konstruktorban kap egy összeadást, pl. 68+12! A getResult() metódus visszaadja a művelet eredményét.
    Egy belső leftOperand és rightOperand attribútumba dolgozz!*/

    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public Operation(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
