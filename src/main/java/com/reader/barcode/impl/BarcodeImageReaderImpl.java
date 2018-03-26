package com.reader.barcode.impl;

import com.google.zxing.*;
import com.reader.barcode.BarcodeImageReader;
import com.reader.exception.ReadBardCodeException;
import com.reader.utils.ReaderUtils;

import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class BarcodeImageReaderImpl implements BarcodeImageReader {

    @Override
    public String readBarcodeFromImage(String imagePath) throws ReadBardCodeException {
        String result;

        Reader reader = new MultiFormatReader();
        BinaryBitmap binaryMap;
        try {
            binaryMap = ReaderUtils.convertToBitMap(imagePath);
        } catch (IOException e) {
            throw new ReadBardCodeException(e);
        }

        try {
            result = reader.decode(binaryMap).getText();
        } catch (NotFoundException e) {
            throw new ReadBardCodeException(e);
        } catch (ChecksumException e) {
            throw new ReadBardCodeException(e);
        } catch (FormatException e) {
            throw new ReadBardCodeException(e);
        }
        return result;
    }
}
