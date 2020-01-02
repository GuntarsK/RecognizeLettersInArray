import java.util.Arrays;
public class Launcher {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

//      Main loop which iterates through big array
        for (int row = 0; row < HiddenText.TextToRecognize.length - 4; row++) {
            for (int col = 0; col < HiddenText.TextToRecognize[row].length - 2; col++) {

//      Creating a 5x3 array blocks from the big array to compare with each 5x3 letter array
                int[][] temp = new int[5][3];
                for (int r = 0; r < 5; r++) {
                    for (int c = 0; c < 3; c++) {
                        temp[r][c] = HiddenText.TextToRecognize[r + row][c + col];
                    }
                }

                if (Arrays.deepEquals(temp, Letters.A) ) {
                    sb.append("A");
                } else if (Arrays.deepEquals(temp, Letters.B) ) {
                    sb.append("B");
                } else if (Arrays.deepEquals(temp, Letters.C) ) {
                    sb.append("C");
                } else if (Arrays.deepEquals(temp, Letters.D) ) {
                    sb.append("D");
                } else if (Arrays.deepEquals(temp, Letters.E) ) {
                    sb.append("E");
                } else if (Arrays.deepEquals(temp, Letters.F) ) {
                    sb.append("F");
                } else if (Arrays.deepEquals(temp, Letters.H) ) {
                    sb.append("H");
                } else if (Arrays.deepEquals(temp, Letters.L) ) {
                    sb.append("L");
                } else if (Arrays.deepEquals(temp, Letters.O) ) {
                    sb.append("O");
                }
            }
        }
        System.out.println(sb);

    }
}