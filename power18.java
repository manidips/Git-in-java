public class power18 {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 10;
        flats[0][1] = 20;
        flats[0][2] = 30;
        flats[1][0] = 40;
        flats[1][1] = 50;
        flats[1][2] = 60;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

    }
}
