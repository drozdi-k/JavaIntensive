package Loops;

public class PowerCalculator {

    public static int power(int number, int pow){
        int result = number, i=2;
        while(i<=pow){
            result=result*number;
            i++;
        }
        return result;
    }
}
