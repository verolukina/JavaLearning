package ArrayExercise;

import java.util.Arrays;

public class iArrays {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i * 10;
        }
        System.out.println(Arrays.toString(nums));

//        for (int i: nums
//             ) {
//            System.out.println(i);
//        }
    }
}
