
public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms=new MergeSort();
		int arr[]= {4,0,6,1,5,2,3};
		ms.printArray(arr);
		System.out.println(" ");
		int lb=0;
		int ub=arr.length-1;
		ms.sort(arr, lb, ub);
		ms.printArray(arr);
	}
	
	public void sort(int[] arr, int lb, int ub) {
		if(lb<ub) {
			int m=(lb+ub)/2;
			sort(arr, lb, m);
			sort(arr, m+1, ub);
			merge(arr, lb, m, ub);
		}
	}
	
	public void merge(int[] arr, int lb, int m, int ub) {
		// Length of first part
		int n1 = m - lb + 1;
		// length of second part
		int n2 = ub - m;

		// dividing array int two sub array left and right

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[lb + i];
		}
		printArray2(L);
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		System.out.print("  < -Split- >  ");
		printArray2(R);
		// sorting and merging array
		int i = 0;
		int j = 0;
		int k = lb;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		System.out.println(" ");
		System.out.println("--------------         ------------------");
		//printArray(arr);
		System.out.println(" ");
	}
	void printArray(int arr[]) {
		int n = arr.length;
		System.out.println(" ------------------------------------------------------");
		System.out.print(" | ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " | ");
		System.out.println(" ");
		System.out.println(" ------------------------------------------------------");
	}
	void printArray2(int arr[]) {
		int n = arr.length;
		System.out.print(" | ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " | ");
	}
}
