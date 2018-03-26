package com.reader.utils;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.reader.exception.ReadQRCodeException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/26/2018.
 */
public class ReaderUtils {

    public static BinaryBitmap convertToBitMap(String imagePath) throws IOException {
        BufferedImage image = ImageIO.read(new File(imagePath));
        int[] px = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
        LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), px);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(source));
        return binaryBitmap;
    }
}
