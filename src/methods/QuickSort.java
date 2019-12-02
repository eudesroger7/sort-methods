package methods;

public class QuickSort {
    private int count;

    public QuickSort() {
        this.count = 0;
    }

    public int sort(int[] array, int first, int last) {

        if (first < last) {
            int pivotPosition = toSeparate(array, first, last);
            sort(array, first, pivotPosition - 1);
            sort(array, pivotPosition + 1, last);
        }

        return this.count;
    }

    private int toSeparate(int[] array, int first, int last) {
        int pivot = array[first];
        int index1 = first + 1, index2 = last;

        while (index1 <= index2) {
            if (array[index1] <= pivot) {
                index1++;
                this.count++;
            } else if (pivot < array[index2]) {
                index2--;
                this.count += 2;
            } else {
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
                index1++;
                index2--;
                this.count += 2;
            }
        }

        array[first] = array[index2];
        array[index2] = pivot;

        return index2;
    }

}
