import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0] = new int[]{1, 2, -1};
        arr[1] = new int[]{1, 2, 3};
        arr[2] = new int[]{1, 2, 3};
        System.out.println(Main.columnsDuplicates(arr));
    }

    public static boolean columnsDuplicates(int[][] arr) {
        int[][] columns = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                columns[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < columns.length; i++) {
            for (int j = i + 1; j < columns.length; j++) {
                for (int k = 0; k < columns[i].length; k++){
                    if (columns[i][k] == columns[j][k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
