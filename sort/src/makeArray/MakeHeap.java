package makeArray;

import org.omg.CORBA.INTERNAL;

/*生成完全二叉树2^h到2^h-1*/
/*n个节点生成*/
public class MakeHeap{
    public static int max;
    public static int maxParent;

    public static int[] makeHeap(int num){
        max = num-1;
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = i;
        }

        int k = (num-1)/2;  //最后一个父节点
        maxParent = k;

        while(k>=0){


            triangleDown(arr,k);

            k--;
        }

        return arr;
    }


    private static void triangleDown(int[] array,int parent){
        int left = 2*parent+1;
        int right = 2*parent+2;
        int maxIndex = left;
        if(right<=max&&array[right]>array[left]){
            maxIndex = right;
        }

        if(array[maxIndex] > array[parent]){
            switchData(array,maxIndex,parent);
        }

        if(left<=maxParent){
            triangleDown(array,left);
        }

        if(right<=maxParent){
            triangleDown(array,right);
        }

    }

    private static void switchData(int[] array,int index1,int index2){
        array[index1] ^= array[index2];
        array[index2] ^= array[index1];
        array[index1] ^= array[index2];
    }

    public static int getHeight(int index){
        int height;

        height = (int)(Math.log(index)/Math.log(2));

        return height;
    }


    public static void printHeap(int[] arr){
        int length = arr.length;
        int maxIndex = length - 1;

    }
}
