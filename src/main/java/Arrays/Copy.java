package Arrays;

//import java.util.Arrays;
public class Copy {
    static int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int size = rightBound - leftBound + 1;
        int[] arrayCopy = new int[size];
        for (int i = 0, left = leftBound - 1; i < size; i++, left++) {
            arrayCopy[i] = in[left];
        }
        return arrayCopy;
    }
}
