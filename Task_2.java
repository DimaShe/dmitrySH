package L6;

public class Task_2 {

    public static boolean checkArray(int[] someArray){
        for (int i = 0; i < someArray.length; i++) {
            if(someArray[i] != 4 && someArray[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int [] array2 = {0, 2, 17, 35, 21, 3, 8};
        int [] array3 = {2, 33, 41, 11, 70};
        int [] array4 = {4, 4, 1, 1, 4, 1, 4, 1};

        checkArray(array1);
        checkArray(array2);
        checkArray(array3);
        checkArray(array4);
    }
}