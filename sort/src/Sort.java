import java.util.Arrays;
import makeArray.*;
import method.*;

public class Sort {
    public static void main(String [] args){
        System.out.println("The sort main begins:");
        int [] nums = MakeArray.createArray(1000);
        System.out.println(Arrays.toString(nums));

        MakeArray.outSequence(nums);
        System.out.println(Arrays.toString(nums));

        QuickSort.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
