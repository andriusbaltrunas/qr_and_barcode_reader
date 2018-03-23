import com.reader.barcode.BarcodeImageReader
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class BarcodeImageReaderTest {

    private BarcodeImageReader barcodeImageReader;

    @Before
    public void beforeMethod() {
        if(barcodeImageReader == null){
            barcodeImageReader = new BarcodeImageReader();
        }
    }

    @Test
    public void testReadImageAndGetBarcode() {
        String result = barcodeImageReader.readBarcode("");
        Assert.assertEquals(result, null);
    }
}
