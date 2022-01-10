public class TestLastore {
    public static void main(String[] args) {
        long elements[] = new long[2];
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i] = -1;
            System.out.println(elements[i]);
        }
    }
}