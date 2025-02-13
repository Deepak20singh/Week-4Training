package javastreamstest.imagetest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static javastreams.bytearraystream.ImageMain.verify;
import static javastreams.bytearraystream.ImageReading.convertIntoByte;
import static javastreams.bytearraystream.ImageWriting.writeByte;

public class ImageTest {
    @Test
    public void Tester() throws IOException {
        String path1="src/main/java/javastreams/bytearraystream/img.png";
        String path2="src/main/java/javastreams/bytearraystream/img1.png";
        byte[] imageByte=convertIntoByte(path1);
        writeByte(imageByte,path2);

        boolean ans=verify(path1,path2);
        Assert.assertEquals(true,ans);
    }
}
