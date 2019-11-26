package methods;

public class InsertionSort {
    private int count;

    public InsertionSort() {
        this.count = 0;
    }

    public int sort(int[] array) {
        int index1, index2, key;

        for (index1 = 1; index1 < array.length; index1++) {
            key = array[index1];
            for (index2 = index1 - 1; (index2 >= 0) && (array[index2] > key); index2--) {
                array[index2 + 1] = array[index2];
            }
            array[index2 + 1] = key;
            this.count++;
        }

        return this.count;
    }
}
