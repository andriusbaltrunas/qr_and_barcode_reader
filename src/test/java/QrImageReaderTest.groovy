import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReaderTest {

    private QrImageReader orImageReader;

    @Before
    public void beforeMethod(){
        orImageReader = new QrImageReader();
    }


    @Test
    public void testQReader(){
        String resultShouldBe = "This is only test";
        String result = orImageReader.readQrImage("QRCode.gif");

        Assert.assertEquals(resultShouldBe, result);
    }
}
