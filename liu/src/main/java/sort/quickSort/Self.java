package sort.quickSort;

/**
 * @author liuhuihai
 * @date 2019-03-28 22:42
 * @description 自己尝试排序
 */
public class Self {

    public static int postion(int[] ary, int low, int high) {
        //第一个元素作为基准点
        int key = ary[0];
        while (low < high) {
            //从后半部分搜素
            while (ary[high] >= key && high > low) {
                high--;
            }
            ary[low] = ary[high];
            //从前半部分开始
            while (ary[low] < key && high > low) {
                low++;
            }
            ary[high] = key;
        }
        return high;
    }

//    public static int[] sort(int[] ary, int low, int high) {
//        if(high < low){
//            return null;
//        }
//        int index = postion(ary,low,high);
//        sort(ary,low,index-1);
//        sort(ary,index +1,high);
//        return null;
//    }

    public static void main(String[] args) {
        System.out.println("Hello World");
//        int[] a = {12, 20, 5, 16, 20, 13, 20,20,15, 1, 30, 45, 23, 9};
        int[] a = {2, 1, 1, 3, 2, 4, 6, 7, 8, 98, 7, 6, 5, 5, 43, 34};
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];


        while (end > start) {
            //从后往前比较
            //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
            while (end > start && a[end] >= key)
                end--;
            if (a[end] < key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
            while (end > start && a[start] <= key)
                start++;
            if (a[start] > key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。
            // 左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        System.out.println("start: " + start + "; end: " + end);
        //递归
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }
}
