

public class BubbleSort {

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 56, 47, 41, 35, 22, 11 };
		// int arr[] = {11, 22, 35, 41, 47, 56 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		String str = "";
		boolean flag = true;
		for (int i = 0; i < n - 1 && flag; i++) {
			// System.out.println("Last Swap "+str);
			System.out.println("-------------- ~ Scan " + (i + 1) + " ~ -------------------");
			str = "";
			flag = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = true;
					str = "" + arr[j] + " , " + arr[j + 1];
					System.out.println(" " + str);
				}

			}
		}
	}
}
