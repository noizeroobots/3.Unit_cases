public class Sorter {
    public static void sort(int[] array) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSorted = false;
                }
            }
        }
    }
}