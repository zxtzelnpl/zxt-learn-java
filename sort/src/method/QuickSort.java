package method;

public class QuickSort {
    private static int count=0;

    public static int[] quickSort(int[] arr){
        int len = arr.length;
        int[] newArr = new int[len];
        System.arraycopy(arr,0,newArr,0,len);
        sort(newArr,0,len-1);
        System.out.println("QuickSort总共用了"+count+"次。");
        return newArr;
    }

    /**
     * 对数组进行快速排序的方法
     * @param nums 需要排序的数组
     * @param begin 数组的起始位置
     * @param end 数组的结束位置
     */
    private static void sort(int[] nums,int begin,int end){
        if(begin<end){
            int i = begin;
            int j = end;
            int k = nums[i];

            while(i<j){
                while(i<j){
                    count++;                                                                                            //计数
                    if(k>nums[j]){
                        nums[i++] = nums[j];
                        break;
                    }else{
                        j--;
                    }
                }
                while(i<j){
                    count++;                                                                                            //计数
                    if(k<nums[i]){
                        nums[j--]=nums[i];
                        break;
                    }else{
                        i++;
                    }
                }
            }

            nums[i] = k;

            sort(nums,begin,i-1);
            sort(nums,i+1,end);
        }
    }

    /**
     * 百度给出的排序算法
     * @param arr 需要排序的数组
     * @param low 排序的起始位置
     * @param high 排序的终止位置
     */
    private static void sort2(int[] arr,int low,int high){
        int l = low;
        int h = high;
        int key = arr[low];

        while(l<h){
            while(l<h&&arr[h]>=key) h--;
            if(l<h) arr[l++] = arr[h];

            while(l<h&&arr[l]<=key) l++;
            if(l<h) arr[h--] = arr[l];
        }
        arr[l] = key;
        if(l>low) sort2(arr,low,l-1);
        if(h<high) sort2(arr,h+1,high);
    }
}
