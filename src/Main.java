import methods.MergeSort;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.testAllMethods(5, 50);
        test.testAllMethods(10, 50);
        test.testAllMethods(50, 50);
        test.testAllMethods(100, 50);
        test.testAllMethods(1000, 50);
        test.testAllMethods(10000, 50);
    }
}