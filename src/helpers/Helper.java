package helpers;

public class Helper {
    public static void Swap(int[] data, int j, int i) {

        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
