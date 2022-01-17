import util.Assert;

public class TestLastore {
    public static void main(String[] args) {
        long elements[] = new long[2];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = -1;
        }
        Assert.isTrue(elements[1] == -1, "test lastore error");
    }
}