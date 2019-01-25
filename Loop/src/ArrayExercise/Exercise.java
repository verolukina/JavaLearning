package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 100; i <= 1000; i++){
            nums.add(i);
        }

        int[] secondNums = new int[nums.size()];

        for (int i = secondNums.length-1, j = 0; i >= 0; i--, j++){
            secondNums[i] = nums.get(j);
        }

//        for (int i: secondNums
//             ) {
//            System.out.println(i);
//        }

        System.out.println("The first array size - " + nums.size());
        System.out.println("The first array elements are: " + Arrays.toString(nums.toArray()));
        System.out.println("The second array size - " + secondNums.length);
        System.out.println("The second array elements are:  - " + Arrays.toString(secondNums));
    }
}
