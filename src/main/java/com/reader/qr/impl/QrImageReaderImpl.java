package com.reader.qr.impl;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.QRCodeReader;
import com.reader.exception.ReadQRCodeException;
import com.reader.qr.QRCodeReaderService;
import com.reader.utils.ReaderUtils;

import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReaderImpl extends QRCodeReader implements QRCodeReaderService {

    @Override
    public String readQRCodeImage(String imagePath) throws ReadQRCodeException {
        String result;
        BinaryBitmap binaryBitmap;

        try {
            binaryBitmap = ReaderUtils.convertToBitMap(imagePath);
        } catch (IOException e) {
            throw new ReadQRCodeException("Cant convert to binary map", e);
        }

        try {
            result = decode(binaryBitmap).getText();
        } catch (NotFoundException e) {
            throw new ReadQRCodeException(e);
        } catch (ChecksumException e) {
            throw new ReadQRCodeException(e);
        } catch (FormatException e) {
            throw new ReadQRCodeException(e);
        }
        return result;
    }
}
