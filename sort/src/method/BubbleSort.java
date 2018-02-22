package method;

public class BubbleSort {
    private static int count = 0;

    /**
     * 冒泡排序
     * @param arr 需要排序的的数组
     * @return 返回一个完成排序的新的数组
     */
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        int[] newArr = new int[len];
        System.arraycopy(arr, 0, newArr, 0, len);

        sort3(newArr);

        System.out.println("BubbleSort总共用了" + count + "次。");
        return newArr;
    }


    /**
     * 最原始的冒泡排序
     * @param arr 需要排序的数组
     */
    private static void sort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                count++;                                                                                                //计数
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 一次改进后的冒泡排序
     * @param arr 需要排序的数组
     */
    private static void sort2(int[] arr) {
        int i = arr.length - 1;

        while (i > 0) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    pos = j;
                }
                count++;                                                                                                //计数
            }
            i = pos;
        }
    }

    /**
     * 一次改进后的冒泡排序，然而并没有减少比较次数
     * @param arr 需要排序的数组
     */
    private static void sort3(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i,j;
        while (low < high) {
            for(i=low;i<high;i++){
                count++;                                                                                                //计数
                if(arr[i]>arr[i+1]) swap(arr,i,i+1);
            }
            --high;
            for(j=high;j>low;j--){
                count++;                                                                                                //计数
                if(arr[j-1]>arr[j]) swap(arr,j,j-1);
            }
            ++low;
        }
    }

    /**
     * 数组中两个值进行交换
     *
     * @param arr 需要交换的数组
     * @param x   交换的位置
     * @param y   交换的位置
     */
    private static void swap(int[] arr, int x, int y) {
        arr[x] ^= arr[y];
        arr[y] ^= arr[x];
        arr[x] ^= arr[y];
    }
}
