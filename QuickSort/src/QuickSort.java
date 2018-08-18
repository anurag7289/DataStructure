
public class QuickSort {

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int cursor = low - 1;
		System.out.println("Pivot " + pivot + " Index " + high);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				cursor++;
				int temp = arr[cursor];
				arr[cursor] = arr[j];
				arr[j] = temp;

			}
		}
		printArray(arr);
		System.out.println("Swap " + arr[cursor + 1] + " -- " + arr[high]);
		int temp = arr[cursor + 1];
		arr[cursor + 1] = arr[high];
		arr[high] = temp;

		return cursor + 1;
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {
			printArray(arr);
			int pi = partition(arr, low, high);
			System.out.println("partition " + pi);
			System.out.println("");
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		printArray(arr);
	}

}
