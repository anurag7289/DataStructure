
public class ShellSort {
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
		ShellSort ss = new ShellSort();
		int arr[] = { 37, 22, 18, 50, 2, 3, 1, 29, 69, 5 };
		ss.shellSort(arr);
		System.out.println("Sorted array");
		ss.printArray(arr);
	}

	int shellSort(int arr[]) {
		int n = arr.length;
		printArray(arr);
		for (int gap = n / 2; gap > 0; gap /= 2) {
			System.out.println("GAP : " + gap);
			// Loop 1 is for Gap
			for (int i = gap; i < n; i += 1) {

				int temp = arr[i];

				int j = i;
				System.out.println("Compared ~~ Index  :  " + (j - gap)+ " <--> "+j);
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}

				arr[j] = temp;

			}
			
			printArray(arr);
		}
		return 0;
	}
}
