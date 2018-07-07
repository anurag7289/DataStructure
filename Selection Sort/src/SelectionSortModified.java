
public class SelectionSortModified {
	
	public static void main(String[] args) {
		SelectionSortModified ssm=new SelectionSortModified();
		int arr[] = { 44, 77, 22, 88, 33, 66, 11, 55 };
		//int arr[] = { 11, 22, 35, 41, 47, 56 };
		ssm.selectionSort(arr);
		System.out.println("Sorted array");
		ssm.printArray(arr);
	}

	public int getMinLoc(int i, int arr[], int arrLength) {
		int minLoc = i;
		int n = arrLength;
		for (int j = i + 1; j <= n - 1; j++) {
			if (arr[j] < arr[minLoc]) {
				minLoc = j;
			}
		}

		return minLoc;
	}

	public void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {
			int minLoc = this.getMinLoc(i, arr, n);
			if (minLoc != i) {
				System.out.println(arr[minLoc] + "  - " + arr[i] + "   |    " + (minLoc + 1) + "  -  " + (i + 1));
				int temp = arr[i];
				arr[i] = arr[minLoc];
				arr[minLoc] = temp;
			}
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
