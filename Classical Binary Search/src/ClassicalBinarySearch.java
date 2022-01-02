

public class ClassicalBinarySearch {
	public static void main(String args[]) {
		
		Solution mySolution = new Solution();
		
		int test1[] = { 2, 3, 4, 10, 40 };
		int test2[] = { 1, 1, 1, 2, 2 };
		int test3[] = { 1, 2, 3, 4, 5, 6, 7};
		
		assert mySolution.binarySearch(test1, 11) == -1 : "test 1 error";
		System.out.println("test 1 passed");
		assert mySolution.binarySearch(test2, 1) == 2 : "test 1 error";
		System.out.println("test 2 passed");
		assert mySolution.binarySearch(test3, 7) == 6 : "test 1 error";
		System.out.println("test 3 passed");
		
		
		
		
	}
}
