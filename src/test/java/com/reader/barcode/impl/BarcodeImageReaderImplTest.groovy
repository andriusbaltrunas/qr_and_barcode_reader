package com.reader.barcode.impl

import com.reader.barcode.BarcodeImageReader
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/26/2018.
 */
class BarcodeImageReaderImplTest {

    private BarcodeImageReader barcodeImageReader;

    @Before
    public void test() {
        if (barcodeImageReader == null) {
            barcodeImageReader = new BarcodeImageReaderImpl();
        }
    }

    @Test
    public void testReadBarcodeFromImage() {
        String shouldBe = "4007249571847";
        String result = barcodeImageReader.readBarcodeFromImage("barcode.gif");
        Assert.assertEquals(shouldBe, result);
    }
}
