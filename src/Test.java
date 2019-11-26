import java.util.Random;

public class Test {
    public static void testAllMethods(int arrayLength, int loopQuantity) {
        Methods methods = new Methods();
        float iterationsBubble = 0;
        float iterationsSelection = 0;
        float iterationsInsertion = 0;
        float iterationsQuick = 0;
        float iterationsHeap = 0;

        for (int i = 0; i < loopQuantity; i++) {
            iterationsBubble += methods.sort("bubble", createData(arrayLength));
            iterationsSelection += methods.sort("selection", createData(arrayLength));
            iterationsInsertion += methods.sort("insertion", createData(arrayLength));
            iterationsQuick += methods.sort("quick", createData(arrayLength));
            iterationsHeap += methods.sort("heap", createData(arrayLength));
        }

        System.out.println("=============== Resultado ===============");
        System.out.printf("Quantidade de vetores testados: %d\n", loopQuantity);
        System.out.printf("Tamanho do vetor: %d\n", arrayLength);
        System.out.printf("Média de iterações:\n");
        System.out.printf("> Bubble Sort: %.1f\n", iterationsBubble / loopQuantity);
        System.out.printf("> Selection Sort: %.1f\n", iterationsSelection / loopQuantity);
        System.out.printf("> Insertion Sort: %.1f\n", iterationsInsertion / loopQuantity);
        System.out.printf("> Quick Sort: %.1f\n", iterationsQuick / loopQuantity);
        System.out.printf("> Heap Sort: %.1f\n", iterationsHeap / loopQuantity);
        System.out.println("=========================================\n");
    }

    public static void testSingleMethod(String method, int arrayLength, int loopQuantity) {
        Methods methods = new Methods();
        float iterations = 0;

        for (int i = 0; i < loopQuantity; i++) {
            iterations += methods.sort(method, createData(arrayLength));
        }

        System.out.println("=============== Resultado ===============");
        System.out.printf("Método: %s sort\n", method);
        System.out.printf("Tamanho do Vetor: %d\n", arrayLength);
        System.out.printf("Quantidade de vetores: %d\n", loopQuantity);
        System.out.printf("Média de iterações: %.1f\n", iterations / loopQuantity);
        System.out.println("=========================================\n");
    }

    private static int[] createData(int length) {
        int[] data = new int[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            data[i] = rand.nextInt(length);
        }

        return data;
    }
}