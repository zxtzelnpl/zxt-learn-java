import java.util.Arrays;
import makeArray.*;
import method.*;

public class Sort {
    public static void main(String [] args){
        System.out.println("The sort main begins:");
        int [] numArr = MakeArray.createArray(100);

        MakeArray.outSequence(numArr);
        System.out.println(Arrays.toString(numArr));

        int[] numArr1 = QuickSort.quickSort(numArr);
        System.out.println(Arrays.toString(numArr1));

        int[] numArr2 = BubbleSort.bubbleSort(numArr);
        System.out.println(Arrays.toString(numArr2));
    }
}