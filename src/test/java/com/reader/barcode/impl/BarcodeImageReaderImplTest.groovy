package com.reader.barcode.impl

import com.reader.barcode.BarcodeImageReader
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/26/2018.
 */
class BarcodeImageReaderImplTest {
    private final List<String> barcodeNames = Arrays.asList("4007249571847", "4007249492326", "4007249808004", "4007249808035", "4007249808059", "4007249894342");

    private BarcodeImageReader barcodeImageReader;

    @Before
    public void test() {
        if (barcodeImageReader == null) {
            barcodeImageReader = new BarcodeImageReaderImpl();
        }
    }

    @Test
    public void testReadBarcodeFromImage() {
       for(String name: barcodeNames) {
           String result = barcodeImageReader.readBarcodeFromImage("barcodes/"+name+".gif");
           Assert.assertEquals(name, result);
       }
    }
}
