import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //        "400,500"
    //})
    @CsvFileSource(files="src/test/resources/sqr.csv")
    public void shouldCalcNumbersOfRoots(int start, int finish) {
        SQRService service = new SQRService();
        // int expected = 2;
        int actual = service.calcSquareRoots(400, 500);

    }
}
