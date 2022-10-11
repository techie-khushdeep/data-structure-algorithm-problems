package problem;// Importing required functions
import java.util.*;

class MaxSlidingWindow {
	public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
		ArrayDeque<Integer> result = new ArrayDeque<>(); // ArrayDeque for storing values
		Deque<Integer> list = new ArrayDeque<Integer>(); // creating a linked list

		if (arr.length > 0) {
			// If window_size is greater than the array size,
			// set the window_size to nums.size()
			if (arr.length < windowSize)
				windowSize = arr.length;
			for (int i = 0; i < windowSize; ++i) {
				// Removing last smallest element index
				while (!list.isEmpty() && arr[i] >= arr[list.peekLast()]) {
					list.removeLast();
				}

				// Adding newly picked element index
				list.addLast(i);
			}

			for (int i = windowSize; i < arr.length; ++i) {
				result.add(arr[list.peek()]);

				// Removing all the elements indexes which are not in the current window
				while ((!list.isEmpty()) && list.peek() <= i - windowSize)
					list.removeFirst();

				// Removing the smaller elements indexes which are not required
				while ((!list.isEmpty()) && arr[i] >= arr[list.peekLast()])
					list.removeLast();

				// Adding newly picked element index
				list.addLast(i);
			}

			// Adding the max number of the current window in the result
			result.add(arr[list.peek()]);
			return result; // returning result
		} else
			return result;
	}

	public static void main(String[] args) {
		int[] targetList = {3, 2, 1, 2};
		int[][] numsList = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67},
				{4, 5, 6, 1, 2, 3}, {9, 5, 3, 1, 6, 3}};
		for (int i = 0; i < targetList.length; i++) {
			System.out.println((i + 1) + ". Original list:\t" + Arrays.toString(numsList[i]));
			System.out.println("   Window size:\t\t" + targetList[i]);
			ArrayDeque<Integer> ouput = findMaxSlidingWindow(numsList[i], targetList[i]);
			System.out.println("   Max:\t\t\t" + ouput);
			System.out.println(
					"-----------------------------------------------------------------------------------------------------\n");
		}
	}
}