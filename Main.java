package Lesson_7;

public class Main {

    public static void main(String[] args) {
        String string = new String("10 3 1 2 \n2 3 2 2\n5 6 7 1\n300 3 1 0");
        try{
            System.out.println(Array(string));}
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static  int Array(String s){
        String[] stringArr = s.split("\n");
        if (stringArr.length != 4) throw new IndexOutOfBoundsException("Кол-во строк в матрице не равно 4x4");
        String[][] matrixArr = {
                stringArr[0].split(" "),
                stringArr[1].split(" "),
                stringArr[2].split(" "),
                stringArr[3].split(" "),
        };
        int[][] intArr = new int[4][4];
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(matrixArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new IndexOutOfBoundsException("В матрице,в строке "+i+" столбце "+j+" не число(символ/слово)");
                }
            }
        }for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr.length; j++) {
                System.out.print(intArr[i][j] + " ");
            }System.out.println(" ");
        }
        int sum = 0;
        int div;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                sum += intArr[i][j];
            }
        }div = sum / 2;
        System.out.print("Сумма матрицы, деленная на 2, равна ");
        return div;
    }

}