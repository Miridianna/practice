public class Main {
    public static void main(String[] args) {
        int start = 400;
        int finish = 500;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= start) {
                continue;
            }
            if (i * i >= finish) {
                break;
            }
            System.out.println(i);
        }
    }
}