package exceptionhandling.trywithresources;

import static exceptionhandling.trywithresources.ReadingFile.readFile;

public class ReadingMain {
    public static void main(String[] args) {
        String path="src/main/java/exceptionhandling/trywithresources/info.txt";
         readFile(path);
    }
}
