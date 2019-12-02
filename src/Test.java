import java.util.Random;

public class Test {
    public static void testAllMethods(int arrayLength, int loopQuantity) {
        Methods methods = new Methods();
        float iterationsBubble = 0;
        float iterationsSelection = 0;
        float iterationsInsertion = 0;
        float iterationsQuick = 0;
        float iterationsHeap = 0;
        float iterationsMerge = 0;

        for (int i = 0; i < loopQuantity; i++) {
            int[] data = generateVector(arrayLength);

            System.out.printf("array => %d \n", i + 1);
            for (int j = 0; j < arrayLength; j++) {
                System.out.printf(" %d", data[j]);
            }
            System.out.println("\n");

            iterationsBubble += methods.sort("bubble", data);
            iterationsSelection += methods.sort("selection", data);
            iterationsInsertion += methods.sort("insertion", data);
            iterationsQuick += methods.sort("quick", data);
            iterationsHeap += methods.sort("heap", data);
            iterationsMerge += methods.sort("merge", data);
        }

        System.out.println("=============== Resultado ===============");
        System.out.printf("Quantidade de vetores testados: %d\n", loopQuantity);
        System.out.printf("Tamanho do vetor: %d\n", arrayLength);
        System.out.printf("Média de iterações:\n");
        System.out.printf("=> Bubble Sort: %.1f\n", iterationsBubble / loopQuantity);
        System.out.printf("=> Selection Sort: %.1f\n", iterationsSelection / loopQuantity);
        System.out.printf("=> Insertion Sort: %.1f\n", iterationsInsertion / loopQuantity);
        System.out.printf("=> Quick Sort: %.1f\n", iterationsQuick / loopQuantity);
        System.out.printf("=> Heap Sort: %.1f\n", iterationsHeap / loopQuantity);
        System.out.printf("=> Merge Sort: %.1f\n", iterationsMerge / loopQuantity);
        System.out.println("=========================================\n");
    }

    public static void testSingleMethod(String method, int arrayLength, int loopQuantity) {
        Methods methods = new Methods();
        float iterations = 0;

        for (int i = 0; i < loopQuantity; i++) {
            iterations += methods.sort(method, generateVector(arrayLength));
        }

        System.out.println("=============== Resultado ===============");
        System.out.printf("Método: %s sort\n", method);
        System.out.printf("Tamanho do Vetor: %d\n", arrayLength);
        System.out.printf("Quantidade de vetores: %d\n", loopQuantity);
        System.out.printf("Média de iterações: %.1f\n", iterations / loopQuantity);
        System.out.println("=========================================\n");
    }

    private static int[] generateVector(int length) {
        int[] vector = new int[length];
        int maxNumber = 100000;
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            vector[i] = random.nextInt(maxNumber);
        }

        return vector;
    }
}