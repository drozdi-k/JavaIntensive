package Arrays;

import java.util.Random;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class ArraysService {

    static Logger logger = Logger.getLogger(ArraysService.class);

    public static int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101); //????
        }
    }

    public static void printArray(int[] array) {  //распечатать логгерами походу
        for (int i = 0; i < array.length; i++) {
             logger.info("array[" + i + "] = " + array[i]);
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public static double avg(int[] array) {    //в случае, если массив пустой, вернуть 0!!!
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return (double) sum / array.length;
    }

    public static int[] sort(int[] array) {
       // Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] array) {
        int len = array.length;
        for(int i=0,j=len-1; i < len/2;i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
