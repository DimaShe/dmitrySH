package L6;

import java.util.Arrays;

public class Task_1 {

    public static int[] newlyBuiltArray(int[] someArray) {
        int a = 0;
        int[] newArray = null;

        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == 4) {
                a = someArray[i];
                newArray = new int[someArray.length - i - 1];
                for (int j = i + 1, b = 0; j < someArray.length; j++, b++) {
                    if (someArray[j] == 4) continue;
                    newArray[b] = someArray[j];
                }
            }
        }
        if (newArray == null) {
            throw new RuntimeException("There is no 4 in array. ");
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int [] array2 = {0, 2, 17, 35, 21, 4, 8};
        int [] array3 = {4, 4, 1, 1, 4, 1, 4, 1};
        int [] array4 = {2, 33, 0, 11, 70};

        newlyBuiltArray(array1);
        System.out.println(Arrays.toString(newlyBuiltArray(array1)));
        newlyBuiltArray(array2);
        System.out.println(Arrays.toString(newlyBuiltArray(array2)));
        newlyBuiltArray(array3);
        System.out.println(Arrays.toString(newlyBuiltArray(array3)));
        newlyBuiltArray(array4);
        System.out.println(Arrays.toString(newlyBuiltArray(array4)));

    }
}