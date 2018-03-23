import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class QrImageReader extends QRCodeReader{

    public String readQrImage(final String imagePath){
        String result = null;

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int[] px = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
            LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), px);
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(source));
            QRCodeReader reader = new QRCodeReader();
            try {
                result = reader.decode(binaryBitmap).getText();
            } catch (NotFoundException e) {
                e.printStackTrace();
            } catch (ChecksumException e) {
                e.printStackTrace();
            } catch (FormatException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Decoder reader = getDecoder();



        return result;
    }
}
