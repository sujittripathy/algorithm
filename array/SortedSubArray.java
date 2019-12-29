public class SortedSubArray {
	public static void main(String str[]) {
		int[] arr = new int[]{0,1,3,7,4,6,9,2};
		int[] result = findSortedSubArr(arr);
		for(int n: result) {
			System.out.print(n + "\t");
		}
	}

	private static int[] findSortedSubArr(int[] arr) {
		int lowerVal = -1;
		int upperVal = -1;
		for(int i=0,j=arr.length-1;i<=j;i++,j--) {
			if((arr[i+1] < arr[i]) && lowerVal == -1) {
				lowerVal = arr[i+1];
			}
			if((arr[j-1] > arr[j]) && upperVal == -1) {
				upperVal = arr[j-1];
			}
		}
		int[] result = new int[2];
        if(lowerVal == -1 && upperVal == -1) {
			return result;
		}
		for(int i=0,j=arr.length-1;i<=j;i++,j--) {
			if(lowerVal < arr[i] && result[0] == 0) {
				result[0] = arr[i];
			}
			if(upperVal > arr[j] && result[1] == 0) {
				result[1] = arr[j];
			}
		}
		return result;
	}
}
