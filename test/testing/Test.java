package testing;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import swing.blurhash.BlurHash;

public class Test {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("E:\\ProjetChat\\Mimi\\src\\icon\\PRO.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
