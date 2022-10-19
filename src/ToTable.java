public class ToTable {
    // write your code here
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] newArray = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newArray[i][j] += data[k];
                k++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        ToTable a = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();

                System.out.println(arr[2][1]);

    }
}

