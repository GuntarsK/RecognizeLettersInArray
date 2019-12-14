import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[][] O = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        int[][] T = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 1, 0},
        };
        int[][] C = {
                {0, 1, 1},
                {0, 1, 0},
                {0, 1, 1},
        };
        int[][] P = {
                {1, 1, 0},
                {1, 1, 0},
                {1, 0, 0},
        };
        int[][] H = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 0, 1},
        };
        int[][] L = {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 1},
        };
        int[][] A = {
                {0, 1, 0},
                {1, 1, 1},
                {1, 0, 1},
        };

        int[][] HL = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1},
        };
        int[][] OOOO = {
                {1, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {1, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 1, 1},
        };

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < HL.length - 2; row++) {
            for (int col = 0; col < HL[row].length - 2; col++) {

//      Creating a 3x3 array/fragment of big array to compare with 3x3 letter arrays
                int[][] temp = new int[3][3];
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        temp[r][c] = HL[r + row][c + col];
                    }
                }

//      Additional rule - creating a fragment one step to the right from "temp" fragment (e.g. C and O)
                int[][] tempNext = new int[3][3];
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (col < HL[row].length-3) {
                            tempNext[r][c] = HL[r + row][c + col + 1];
                        }
                    }
                }


                if (Arrays.deepEquals(temp, O) ) {
                    sb.append("O");
                }
                if ( Arrays.deepEquals(temp, C) && !Arrays.deepEquals(tempNext, O) ) {
                    sb.append("C");
                }
                if (Arrays.deepEquals(temp, T) ) {
                    sb.append("T");
                }
                if (Arrays.deepEquals(temp, P) ) {
                    sb.append("P");
                }
                if (Arrays.deepEquals(temp, H) ) {
                    sb.append("H");
                }
                if (Arrays.deepEquals(temp, L) ) {
                    sb.append("L");
                }
                if (Arrays.deepEquals(temp, A) ) {
                    sb.append("A");
                }
            }
        }
        System.out.println(sb);


    }
}