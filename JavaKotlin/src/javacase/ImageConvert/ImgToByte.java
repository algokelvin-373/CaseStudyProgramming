package javacase.ImageConvert;

import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class ImgToByte {
    public static void main(String[] args) throws IOException {
        BufferedImage bImage = ImageIO.read(new File("src/javacase/ImageConvert/sample.png"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "png", bos );
        byte [] data = bos.toByteArray();

        String byteString = Arrays.toString(data);
        int lengthByte = byteString.length();
        System.out.println("ByteString: "+ byteString);
        System.out.println("Length: "+ lengthByte);
    }
    
}
