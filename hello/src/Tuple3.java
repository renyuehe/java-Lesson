public class Tuple3 <L, M, R> {

    private L left;
    private M middle;
    private R right;

    public Tuple3(L left, M middle, R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMiddle() {
        return middle;
    }

    public R getRight() {
        return right;
    }
}
