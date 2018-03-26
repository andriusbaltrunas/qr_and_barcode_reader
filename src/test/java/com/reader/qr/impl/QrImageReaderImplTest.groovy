package com.reader.qr.impl

import com.reader.qr.QRCodeReaderService
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReaderImplTest {

    QRCodeReaderService qrCodeReaderService;

    @Before
    public void before(){
        qrCodeReaderService = new QrImageReaderImpl();
    }

    @Test
    public void testReadQRCodeFromImage(){
        String whatShouldBe = "This is only test";
        String result = qrCodeReaderService.readQRCodeImage("QRCode.gif");
        Assert.assertEquals(whatShouldBe, result)
    }
}
