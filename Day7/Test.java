package Day7;

public class Test {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        ArrayPrinter.printIntArray(intArray);
        
        String[] stringArray = {"a", "b", "c"};
        ArrayPrinter.printStringArray(stringArray);
        
        float[] floatArray = {1.1f, 2.2f, 3.3f};
        ArrayPrinter.printFloatArray(floatArray);
        
        double[] doubleArray = {1.234, 5.678, 9.1011};
        ArrayPrinter.printDoubleArray(doubleArray);
    }
    
    static class ArrayPrinter {
        public static void printIntArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        
        public static void printStringArray(String[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        
        public static void printFloatArray(float[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        
        public static void printDoubleArray(double[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
