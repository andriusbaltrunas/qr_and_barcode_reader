package com.reader.qr.impl;

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.reader.exception.ReadQRCodeException;
import com.reader.qr.QRCodeReaderService;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReaderImpl extends QRCodeReader implements QRCodeReaderService {

    @Override
    public String readQRCodeImage(String imagePath) throws ReadQRCodeException {
        String result;
        BinaryBitmap binaryBitmap = conwertToBitMap(imagePath);
        if (binaryBitmap == null) {
            throw new ReadQRCodeException("Cant convert to binary map");
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

    private BinaryBitmap conwertToBitMap(String imagePath) throws ReadQRCodeException {
        BinaryBitmap binaryBitmap;
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int[] px = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
            LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), px);
            binaryBitmap = new BinaryBitmap(new HybridBinarizer(source));
        } catch (IOException e) {
            throw new ReadQRCodeException(e);
        }
        return binaryBitmap;
    }


}
