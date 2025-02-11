package recursion_question2;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 8, 2, 10, 6, 7};
        System.out.println("Largest Number: " + getLargestNum(numbers, 0));
	}
	
	public static int getLargestNum(int[] arr, int index) {
        int tempLargest = arr[index];

        if (index < arr.length - 1) {
            int nextLargest = getLargestNum(arr, index + 1);
            if (tempLargest < nextLargest) {
                tempLargest = nextLargest;
            }
        }
        return tempLargest;
    }

}
