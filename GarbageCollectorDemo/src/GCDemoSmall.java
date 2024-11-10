public class GCDemoSmall {
    private static final int SIZE = 100;

    public static void main(String[] args) {
        System.out.println("\t\tStarting GC Demo...");

        createObjects();
        System.out.println("Iteration completed, waiting for GC.");
        System.gc();

        System.out.println("\t\tGC Demo completed.");
    }

    private static void createObjects() {
        Object[] array = new Object[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = new Object();
        }
    }
}
