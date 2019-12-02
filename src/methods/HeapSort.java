package methods;

public class HeapSort {
    private int count;

    public HeapSort() {
        this.count = 0;
    }

    public int sort(int[] array) {

        for (int index1 = array.length / 2 - 1; index1 >= 0; index1--) {
            heapify(array, array.length, index1);
        }

        for (int index2 = array.length - 1; index2 >= 0; index2--) {

            int temp = array[0];
            array[0] = array[index2];
            array[index2] = temp;

            heapify(array, index2, 0);
        }

        return this.count;
    }

    private void heapify(int array[], int arrayLength, int rootElementIndex) {

        int leftIndex = 2 * rootElementIndex + 1;
        int rightIndex = 2 * rootElementIndex + 2;

        int largest = rootElementIndex;

        if (leftIndex < arrayLength && array[leftIndex] > array[largest]) {
            largest = leftIndex;
        }
        this.count++;

        if (rightIndex < arrayLength && array[rightIndex] > array[largest]) {
            largest = rightIndex;
        }
        this.count++;

        if (largest != rootElementIndex) {

            int temp = array[rootElementIndex];
            array[rootElementIndex] = array[largest];
            array[largest] = temp;

            heapify(array, arrayLength, largest);
        }
    }
}
