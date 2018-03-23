package com.reader.qr;

import com.reader.exception.ReadQRCodeException;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public interface QRCodeReaderService {

    String readQRCodeImage(String imagePath) throws ReadQRCodeException;
}
