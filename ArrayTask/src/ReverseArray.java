import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        //get array size
        int length = array.length;

        //declare and create the reversed array
       int[] reverce = new int[length];

        //initialize the reverse array
        for (int i = 0; i < length; i++) {
            reverce[length - i - 1] = array[i];
        }
        //print reversed array
        System.out.println(Arrays.toString(reverce));
    }
}
