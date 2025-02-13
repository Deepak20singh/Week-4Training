package javastreams.bufferedstreams;

import static javastreams.bufferedstreams.EfficientBuffer.readWriteBuffer;

public class EfficientMain {
    public static void main(String[] args) {
        String filePath1="src/main/java/javastreams/bufferedstreams/Sample1.txt";
        String filePath2="src/main/java/javastreams/bufferedstreams/Sample2.txt";
        readWriteBuffer(filePath1,filePath2);

    }
}
