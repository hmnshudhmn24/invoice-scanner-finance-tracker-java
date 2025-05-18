
package invoicescanner;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InvoiceScanner {

    public static void main(String[] args) {
        File imageFile = new File("invoice-sample.png");

        ITesseract instance = new Tesseract();
        instance.setDatapath("tessdata"); // path to tessdata directory

        try {
            BufferedImage image = ImageIO.read(imageFile);
            String result = instance.doOCR(image);
            System.out.println("🧾 Extracted Invoice Data:");
            System.out.println(result);
        } catch (TesseractException | IOException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
