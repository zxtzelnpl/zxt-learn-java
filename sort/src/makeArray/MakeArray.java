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
     * @param arr 给定的数组
     */
    public static void outSequence(int[] arr){
        int len = arr.length;
        Random random  = new Random();
        for(int i = 0;i<len;i++){
            int p = random.nextInt(len);
            int tmp = arr[i];
            arr[i] = arr[p];
            arr[p] = tmp;
        }
    }

    /**
     * 对给定的数组进行翻转
     * @param arr 给定的数组
     */
    public static void reverse(int[] arr){
        int len = arr.length;
        for(int i =0;i<arr.length/2;i++){
            swap(arr,i,len-i-1);
        }
    }

    /**
     * 对给定的数组进行翻转
     * @param arr 给定的数组
     * @param x 第一个位置
     * @param y 第二个位置
     */
    private static void swap(int[] arr, int x, int y) {
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }
}
