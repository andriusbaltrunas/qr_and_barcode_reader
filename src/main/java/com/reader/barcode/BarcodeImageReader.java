package com.reader.barcode;

import com.reader.exception.ReadBardCodeException;

/**
 * Created by andriusbaltrunas on 3/26/2018.
 */
public interface BarcodeImageReader {

    String readBarcodeFromImage(String imagePath) throws ReadBardCodeException;
}
