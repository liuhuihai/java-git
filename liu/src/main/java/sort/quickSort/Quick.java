package sort.quickSort;

/**
 * @author liuhuihai
 * @date 2019-04-09 21:37
 * @description 快速排序
 */
public class Quick {
    public static int position(int[] ary, int low, int high) {
        //选取基准点
        int key = ary[low];
        System.out.println("low: " + low + "; " + "high: " + high );
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "  ");
        }
        System.out.println();
        while (low < high) {
            //从后往前排序
            while (low < high && ary[high] >= key) {
                high--;
            }
            if (ary[high] < key) {
                int temp = ary[high];
                ary[high] = ary[low];
                ary[low] = temp;
            }

            while (ary[low] <= key && low < high) {
                low++;
            }
            if (ary[low] > key) {
                int temp = ary[high];
                ary[high] = ary[low];
                ary[low] = temp;
            }
            System.out.println("low: " + low + "; " + "high: " + high );
            for (int i = 0; i < ary.length; i++) {
                System.out.print(ary[i] + "  ");
            }
            System.out.println();
        }
        return high;
    }

    public static void sort(int[] ary, int low, int high) {
        if (low > high) {
            throw new NullPointerException("low 必须小于high");
        }
        int index = position(ary, low, high);
        if (index > low) {
            sort(ary, low, index - 1);
        }
        if (index < high) {
            sort(ary, index + 1, high);
        }


    }

    public static void main(String[] args) {
        int[] ary = {2, 90, 1, 31, 1,32, 4, 6, 7, 8, 98, 7, 26, 5, 5,45, 43, 34};
        int length = ary.length;
        sort(ary, 0, length - 1);
//        for (int i = 0; i < length; i++) {
//            System.out.println(ary[i]);
//        }
    }

    public static void sortTest(int[] ary, int low, int high) {
        int key = ary[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (end > start && ary[end] >= key) {
                end--;
            }
            if (ary[end] < key) {
                int temp = ary[end];
                ary[end] = ary[start];
                ary[start] = temp;
            }
            while (ary[start] <= key && start < end) {
                start++;
            }
            if (ary[start] > key) {
                int temp = ary[end];
                ary[end] = ary[start];
                ary[start] = temp;
            }

        }
        if (low < start) {
            sortTest(ary, low, start - 1);
        }
        if (high > end) {
            sortTest(ary, end + 1, high);
        }
    }
}
