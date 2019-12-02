package methods;

public class SelectionSort {
    private int count;

    public SelectionSort() {
        this.count = 0;
    }

    public int sort(int[] array) {

        int index1, index2, smaller, temp;

        for (index1 = 0; index1 < (array.length - 1); index1++) {
            smaller = index1;

            for (index2 = (index1 + 1); index2 < array.length; index2++) {
                if(array[index2] < array[smaller]) {
                    smaller = index2;
                    this.count++;
                }
            }

            if(index1 != smaller) {
                temp = array[index1];
                array[index1] = array[smaller];
                array[smaller] = temp;
                this.count++;
            }
        }


        return this.count;
    }
}
