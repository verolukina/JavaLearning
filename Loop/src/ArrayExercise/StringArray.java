package ArrayExercise;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] monthes = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Avg", "Sep", "Oct", "Nov", "Dec"};

        String result = "";

        for (String i : monthes
             ) {
            if (i.equals(monthes[monthes.length-1])){
                result += i + ".";
            }else {
                result += i + ", ";
            }
        }

        System.out.println(result);
    }
}
