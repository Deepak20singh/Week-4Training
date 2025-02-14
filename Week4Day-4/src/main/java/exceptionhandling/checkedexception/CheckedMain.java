package exceptionhandling.checkedexception;

import static exceptionhandling.checkedexception.Checked.checkedException;

public class CheckedMain {
    public static void main(String[] args) {
        String path="src/main/java/exceptionhandling/checkedexception/data.txt";
        checkedException(path);
    }
}
