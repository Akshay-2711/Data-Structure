package Search;

public class binarysearch {
	public static int binarySearch(int arr[], int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			if (key < arr[mid]) {
				right = mid - 1;
			} else
				left = mid + 1;

		}
		return -1;

	}

}