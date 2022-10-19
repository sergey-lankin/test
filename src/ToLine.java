public class ToLine {
        // write your code here
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
         int x = data.length;
         int y = data[0].length;
         int z = x * y;
         int[] newArray = new int[z];
         int k = 0;
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < y; j++) {
                 newArray[k] += data[i][j];
                 k++;
             }
         }
            return newArray;
    }

        public static void main(String[] args) {

            ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
            int[] arr = a.resize();

            System.out.println(arr[0]);

        }
    }




