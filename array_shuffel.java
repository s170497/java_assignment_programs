import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        Random rand = new Random();
        for (int i = originalArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = originalArray[i];
            originalArray[i] = originalArray[j];
            originalArray[j] = temp;
        }

        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}