import java.util.Arrays;
import java.util.Date;
import makeArray.*;
import method.*;

public class Sort {
    public static void main(String [] args){
        System.out.println("The sort main begins:");
        int [] numArr = MakeArray.createArray(5000000);

        MakeArray.outSequence(numArr);
        /*System.out.println(Arrays.toString(numArr));*/
        Long start = new Date().getTime();
        int[] numArr1 = QuickSort.quickSort(numArr);
        Long end = new Date().getTime();

        System.out.println(end-start);
        /*System.out.println(Arrays.toString(numArr1));*/

        /*int[] numArr2 = BubbleSort.bubbleSort(numArr);
        System.out.println(Arrays.toString(numArr2));*/
    }
}