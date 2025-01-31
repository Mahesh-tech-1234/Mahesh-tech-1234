public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            // Attempting to access an element beyond the array's bounds
            int element = numbers[3]; // This line will throw an ArrayIndexOutOfBoundsException
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
    }
}
