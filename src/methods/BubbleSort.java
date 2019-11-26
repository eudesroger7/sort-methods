package methods;

public class BubbleSort {
    private int count;

    public BubbleSort() {
        this.count = 0;
    }

    public int sort(int[] array) {
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    changed = true;
                    this.count++;
                }
            }
        }

        return this.count;
    }
}
