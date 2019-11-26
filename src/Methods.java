import methods.*;

public class Methods {
    public int sort(String method, int[] data) {
        switch (method) {
            case "bubble":
                return bubbleSort(data);
            case "selection":
                return selectionSort(data);
            case "insertion":
                return insertionSort(data);
            case "quick":
                return quickSort(data);
            case "heap":
                return heapSort(data);
        }

        return -1;
    }

    private static int bubbleSort(int[] array) {
        BubbleSort bubble = new BubbleSort();
        return bubble.sort(array);
    }

    private static int selectionSort(int[] array) {
        SelectionSort selectionSort = new SelectionSort();
        return selectionSort.sort(array);
    }

    private static int insertionSort(int[] array) {
        InsertionSort insertionSort = new InsertionSort();
        return insertionSort.sort(array);
    }

    private int quickSort(int[] array) {
        QuickSort quickSort = new QuickSort();
        System.out.printf("quick sort => %d", quickSort.sort(array, 0, array.length - 1));
        return quickSort.sort(array, 0, array.length - 1);
    }

    private int heapSort(int[] array) {
        HeapSort heapSort = new HeapSort();
        return heapSort.sort(array);
    }
}