package homework14;

public class ArrayValueCalculator {
    public static int doCalc(String[][] input) {
        int result = 0;
        int[][] intArr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            if (input.length != 4 || input[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(input[i][j]);
                    result += intArr[i][j];
                } catch (NumberFormatException ex) {
                    throw new ArrayDataException();
                }
            }
        }
        return result;
    }
}

