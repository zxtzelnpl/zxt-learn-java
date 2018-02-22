package method;

public class QuickSort {
    public static void quickSort(int[] nums){
        sort(nums,0,nums.length-1);
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
                    if(k>nums[j]){
                        nums[i++] = nums[j];
                        break;
                    }else{
                        j--;
                    }
                }
                while(i<j){
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
    public static void sort2(int[] arr,int low,int high){
        int l = low;
        int h = high;
        int povit = arr[low];

        while(l<h){
            while(l<h&&arr[h]>=povit) h--;
            if(l<h){
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while(l<h&&arr[l]<=povit) l++;
            if(l<h){
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            if(l>low) sort(arr,low,l-1);
            if(h<high) sort(arr,h+1,high);
        }

    }
}
