package week03;

public class Operation {
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
