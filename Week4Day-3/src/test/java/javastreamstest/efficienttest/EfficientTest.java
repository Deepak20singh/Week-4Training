package javastreamstest.efficienttest;

import org.junit.Assert;
import org.junit.Test;

import static javastreams.bufferedstreams.EfficientBuffer.readWriteBuffer;
import static javastreams.bufferedstreams.EfficientUnbuffer.readWriteUsingUnbuffer;

public class EfficientTest {
    @Test
    public void Tester(){
        String filePath1="src/main/java/javastreams/bufferedstreams/Sample1.txt";
        String filePath2="src/main/java/javastreams/bufferedstreams/Sample2.txt";
        long bufferTime=readWriteBuffer(filePath1,filePath2);
        long unbufferTime=readWriteUsingUnbuffer(filePath1,filePath2);
        Assert.assertEquals(true,bufferTime<unbufferTime);

    }
}
