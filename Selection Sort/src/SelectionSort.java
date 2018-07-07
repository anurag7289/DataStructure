
public class SelectionSort {

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		SelectionSort ss = new SelectionSort();
		int arr[] = { 44, 77, 22, 88, 33, 66, 11, 55 };
		// int arr[] = { 11, 22, 35, 41, 47, 56 };
		ss.selectionSort(arr);
		System.out.println("Sorted array");
		ss.printArray(arr);
	}

	public void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {

			int minLoc = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (arr[j] < arr[minLoc]) {
					minLoc = j;
				}
			}
			System.out.println("----------------");
			// Swap
			System.out.println(arr[minLoc] + "  - " + arr[i] + "   |    " + (minLoc + 1) + "  -  " + (i + 1));
			int temp = arr[i];
			arr[i] = arr[minLoc];
			arr[minLoc] = temp;

		}
	}
}
