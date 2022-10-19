import java.util.Arrays;

public class Separator {
    // write your code here
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                j++;
            }
        }
        int k = 0;
        int[] evenArray = new int[j];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                evenArray[k] += array[i];
                k++;
            }
        }
        return evenArray;
    }

    public int[] odd() {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                j++;
            }
        }
        int k = 0;
        int[] oddArray = new int[j];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                oddArray[k] += array[i];
                k++;
            }
        }
        return oddArray;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        Separator separator = new Separator(array);
        int[] test = separator.odd();
        for(int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
