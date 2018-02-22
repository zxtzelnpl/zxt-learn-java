package makeArray;

import java.util.Random;

public class MakeArray {
    /**
     * 生成对给定数目的自0开始步长为1的数组
     * @param num 给定的数目
     * @return 数组
     */
    public static int[] createArray(int num){
        int[] nums = new int[num];
        for(int i = 0;i<num;i++){
            nums[i] = i;
        }
        return nums;
    }

    /**
     * 对给定的数组进行乱序排列
     * @param nums 给定的数组
     */
    public static void  outSequence(int[] nums){
        int len = nums.length;
        Random random  = new Random();
        for(int i = 0;i<len;i++){
            int p = random.nextInt(len);
            int tmp = nums[i];
            nums[i] = nums[p];
            nums[p] = tmp;
        }
    }

}
