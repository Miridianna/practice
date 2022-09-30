public class SQRService {
    public int calcSquareRoots(int start, int finish) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start) {
                return i;
            }
        }
        return -1;
    }
}
