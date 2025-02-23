public class MySixProgram {
    public static void main(String[] args) {
        //dvojrozmerne pole
        int[] row = {2, 5, 6};

        int[][] table = {{1, 2 ,3}, {4, 5, 6, 7}};

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                //table[i][j] = 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
