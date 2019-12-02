package methods;

public class MergeSort {
    private int count;

    public MergeSort() {
        this.count = 0;
    }

    public int sort(int[] array, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;

            sort(array, begin, middle);
            sort(array, middle + 1, end);
            merge(array, begin, middle, end);
        }

        return this.count;
    }

    private void merge(int array[], int begin, int middle, int end) {
        int left = middle - begin + 1;
        int right = end - middle;

        int LeftArray[] = new int[left];
        int RightArray[] = new int[right];

        for (int index1 = 0; index1 < left; index1++) {
            LeftArray[index1] = array[begin + index1];
        }

        for (int j = 0; j < right; ++j) {
            RightArray[j] = array[middle + 1 + j];
        }

        int index2 = 0, index3 = 0;
        int index4 = begin;

        while (index2 < left && index3 < right) {
            this.count++;
            if (LeftArray[index2] <= RightArray[index3]) {
                array[index4] = LeftArray[index2];
                index2++;
            } else {
                array[index4] = RightArray[index3];
                index3++;
            }
            index4++;
        }
        while (index2 < left) {
            this.count++;
            array[index4] = LeftArray[index2];
            index2++;
            index4++;
        }

        while (index3 < right) {
            this.count++;
            array[index4] = RightArray[index3];
            index3++;
            index4++;
        }
    }
}