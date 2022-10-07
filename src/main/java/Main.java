public class Main {
    public static void main(String[] args) {
        int start = 200;
        int finish = 300;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start) {
                if (i * i <= finish) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}