import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble_sort_7_6 {
    public static void main(String[] args) {
        int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
        BubbleSort(arr);
        int searchWord = 20;
        int found = BinarySearch(arr,searchWord);
        if(found != -1){
            System.out.println("found index:"+ found);
        }else{
            System.out.println("not found in array!");
        }
    }

    public static void BubbleSort(int[] array) {
        int[] nums = {3, 1, 6, 2, 9, 0, 4, 7, 8, 5};
        int temp = 0;
        System.out.println(nums);
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println("-------------------");
            System.out.println(Arrays.toString(nums));
        }
    }

    public static int BinarySearch(int[] arr, int value) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        int mid = arr.length / 2 ;
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]<value){
                low = mid+1;
            }
            if(arr[mid]>value){
                high = mid-1;
            }
            if(arr[mid]==value){
                return mid;
            }
        }
        return -1;
    }
}
