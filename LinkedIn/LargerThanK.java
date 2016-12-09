package binarySearch;

public class LargerThanK {
	
	public int largerThanK(int[] arr, int k) {
		if(arr == null || arr.length == 0)
			throw new IllegalArgumentException();
		
		int head = 0;
		int end = arr.length - 1;
		int middle = (head + end) / 2;
		while(head < end) {
			if(arr[middle] <= k) {
				// head Moves to end side 
				head = middle + 1;
				middle = (head + end) / 2;
			} else {
				// end Moves to head side 
				end = middle; 
				middle = (head + end) /2;
			}
		}
		if(arr[head] > k)
			return arr[head];
		return Integer.MAX_VALUE;		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4,5,5,6,7,8};
		LargerThanK ltk = new LargerThanK();
		
		int res = ltk.largerThanK(arr, 5);
		System.out.println("Expected res to be: 6." );
		System.out.println("Actual result is: " + res);
		System.out.println();
		
		res = ltk.largerThanK(arr, 8);
		System.out.println("Expected res to be: No exist." );
		System.out.println("Actual result is: " + res);
		System.out.println();
		
		res = ltk.largerThanK(arr, -1);
		System.out.println("Expected res to be: 1." );
		System.out.println("Actual result is: " + res);
		System.out.println();
		
		
	}
}
