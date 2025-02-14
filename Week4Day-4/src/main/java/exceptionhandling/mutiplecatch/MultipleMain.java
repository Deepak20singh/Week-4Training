package exceptionhandling.mutiplecatch;

import static exceptionhandling.mutiplecatch.MultipleCatchCode.multipleCatchBlock;

public class MultipleMain {
    public static void main(String[] args) {
        int[] arr=new int[6];

        multipleCatchBlock(arr,2);
    }
}
