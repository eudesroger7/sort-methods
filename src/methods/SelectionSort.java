package methods;

public class SelectionSort {
    private int count;

    public SelectionSort() {
        this.count = 0;
    }

    public int sort(int[] array) {
        for (int index1 = 0; index1 < array.length - 1; index1++) {
            int smaller = index1;

            for (int index2 = smaller + 1; index2 < array.length; index2++) {
                if (array[index2] < array[smaller]) {
                    smaller = index2;
                }
            }

            if (smaller != index1) {
                int temp = array[index1];
                array[index1] = array[smaller];
                array[smaller] = temp;
                this.count++;
            }
        }

        return this.count;
    }
}
