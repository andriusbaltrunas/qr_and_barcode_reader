import com.reader.qr.impl.QrImageReaderImpl
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReaderTest {

    private QrImageReaderImpl orImageReader;

    @Before
    public void beforeMethod(){
        orImageReader = new QrImageReaderImpl();
    }


    @Test
    public void testQReader(){
        String resultShouldBe = "This is only test";
        String result = orImageReader.readQrImage("QRCode.gif");

        Assert.assertEquals(resultShouldBe, result);
    }
}
