package recursion_question1;

public class RecursiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum (From Start): " + displayArrayStartsFromFirstIndex(numbers, 0));
        System.out.println("Sum (From End): " + displayArrayStartsFromLastIndex(numbers, numbers.length - 1));
        System.out.println("Sum (Divide and Conquer): " + displayArraySplitInHalf(numbers, 0, numbers.length - 1));
	}
	
	public static int displayArrayStartsFromFirstIndex(int[] arr, int index) {
        // Base case: If index reaches the end, return 0
        if (index == arr.length) {
            return 0;
        }
        // Recursive step: Add current element to sum of remaining elements
        return arr[index] + displayArrayStartsFromFirstIndex(arr, index + 1);
    }
	
	public static int displayArrayStartsFromLastIndex(int[] arr, int index) {
        // Base case: If index is negative, return 0
        if (index < 0) {
            return 0;
        }
        // Recursive step: Add current element to sum of previous elements
        return arr[index] + displayArrayStartsFromLastIndex(arr, index - 1);
    }
	
	public static int displayArraySplitInHalf(int[] arr, int left, int right) {
        // Base case: If left index equals right, return that single element
        if (left == right) {
            return arr[left];
        }
        // Find the middle index
        int mid = (left + right) / 2;
        // Recursive step: Sum left and right halves
        return displayArraySplitInHalf(arr, left, mid) + displayArraySplitInHalf(arr, mid + 1, right);
    }

}
