public class ArrayList {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 18, 20, 53};
        System.out.println("Array Elements:");
        
        // Iterate and print array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate and display the sum of the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of Array Elements: " + sum);
    }
}