package sort;

/**
 * Created by zhenyu on 17-8-4.
 */
public class SortAlgo {

    /**
     *1.冒泡排序
     比较相邻的元素。如果第一个比第二个大，就交换他们两个;
     对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数;
     针对所有的元素重复以上的步骤，除了最后一个;
     持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for (int j=i+1;j<len-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= tmp;
                }
            }
        }
        for (int i =0;i<len;i++){
            System.out.println(arr[i]);
        }

    }

    /**
     *2.选择排序
     首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置;
     再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾;
     重复第二步，直到所有元素均排序完毕。
     *
     */
    public void selectionSort(int[] arr){
        int len = arr.length;
        int minIndex;
        int min;
        for (int i=0;i<len-1;i++){
            minIndex=len-i-1;
            for (int j=0;j<len-i;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            min = arr[minIndex];
            arr[minIndex] = arr[len-1-i];
            arr[len-1-i] = min;
        }
        for (int i =0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * 3.插入排序
     将待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
     从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
     （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
     */
    public void insertionSort(int[] arr){
        int len = arr.length;
        for (int i=1;i<len;i++){
            int index=i-1;
            int tmp=arr[i];
            while(index>=0&&tmp<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1] = tmp;
        }
        for (int i =0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        SortAlgo sortAlgo = new SortAlgo();
        int[] arr = new int[]{12,13,11,15,14,16,19,18,17};
        sortAlgo.insertionSort(arr);
    }
}
