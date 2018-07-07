import java.net.StandardSocketOptions;

public class InsersionSort {
	void printArray(int arr[]) {
		int n = arr.length;
		System.out.println(" ------------------------------------------------------");
		System.out.print(" | ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " | ");
		System.out.println(" ");
		System.out.println(" ------------------------------------------------------");
	}

	public static void main(String args[]) {
		InsersionSort is = new InsersionSort();
		int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
		// int arr[] = { 11, 22, 35, 41, 47, 56 };
		System.out.print("Data");
		// System.out.println("");
		is.printArray(arr);
		is.insersionSort(arr);
		System.out.println("Sorted array");
		is.printArray(arr);
	}

	public void insersionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			System.out.println("Key : " + key);
			/*
			 * Here we need to insert the key to correct location First we need to move
			 * other element (left adjecent element) to right side if left adjecent element
			 * is greater than key. By moving element to right it will create exact
			 * place/location where key will be placed with each sacn
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];

				j = j - 1;
				printArray(arr);
			}
			//System.out.println(j + "  index : " + (j + 1));
			arr[j + 1] = key;

		}
	}
}
