package javacase.ImageConvert;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImgToByte {
    public static void main(String[] args) throws IOException {
        String path = "src/javacase/ImageConvert/sample.png";

        long start = System.currentTimeMillis();

        ConvertImg imgConvert = new ConvertImg(new File(path));
        imgConvert.convertImgToByte();
        byte[] data = imgConvert.getData();
        String hex = imgConvert.byteToHex(data);
        int lengthHex = hex.length();

        long finish = System.currentTimeMillis();

        System.out.println("ByteString: "+ imgConvert.getByteString());
        System.out.println("\n");
        System.out.println("HexString: "+ hex);
        System.out.println("Length: "+ lengthHex);
        System.out.println("\n");

        System.out.println("Time execution: "+ (finish - start));
    }

}
