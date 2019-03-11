import java.util.Arrays;
import java.util.stream.IntStream;

public class main {

	public static void main(String[] args) {
		main array = new main();
		int[] arr1 = {9,8,7,6,5,4,3,2,1,0};
		int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
		int[] arr3 = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println("Swap Count: " + array.selectionSort(arr1));
		System.out.println("\n\n\n");
		
		System.out.println("Swap Count: " + array.bubbleSort(arr2));
		System.out.println("\n\n\n");
		
		System.out.println("Swap Count: " + array.insertionSort(arr3));
		System.out.println("\n\n\n");
		
		int[] arr4 = new int[10000];
		fillArray(arr4);
		
		int[] arr5 = new int[10000];
		fillArray(arr5);
		
		int[] arr6 = new int[10000];
		fillArray(arr6);
		
		long startTime1 = System.nanoTime();
		array.selectionSortTime(arr4);
		long endTime1 = System.nanoTime();

		System.out.println("Selection Sort Time: " + (endTime1 - startTime1));
		
		long startTime2 = System.nanoTime();
		array.bubbleSortTime(arr5);
		long endTime2 = System.nanoTime();

		System.out.println("Bubble Sort Time: " + (endTime2 - startTime2));
		
		long startTime3 = System.nanoTime();
		array.insertionSortTime(arr6);
		long endTime3 = System.nanoTime();

		System.out.println("Insertion Sort Time: " + (endTime3 - startTime3));
	}
	
	public int selectionSort(int arr[]){ 
        int n = arr.length; 
        int selectionSwapCount = 0;
        System.out.println("Selection Sort:" + "\n" + Arrays.toString(arr) + "\n");
 
        for (int i = 0; i < (n/2); i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            	
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            
            selectionSwapCount++;
    		System.out.println(Arrays.toString(arr));
        } 
        return selectionSwapCount;
    } 
	
	public int bubbleSort(int arr[]){ 
		int bubbleSwapCount = 0;
        int n = arr.length; 
        System.out.println("Bubble Sort:" + "\n" + Arrays.toString(arr) + "\n");

        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]){ 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    
                    bubbleSwapCount++;
            		System.out.println(Arrays.toString(arr));
                } 
        return bubbleSwapCount++;
    } 
	
	public int insertionSort(int arr[]){ 
		int insertionSwapCount = 0;
		int shiftCount = 0;
        int n = arr.length; 
        System.out.println("Insertion Sort:" + "\n" + Arrays.toString(arr) + "\n");
        
        for (int i=1; i<n; ++i){ 
            int key = arr[i]; 
            int j = i-1; 
  
            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                System.out.println(Arrays.toString(arr));
                shiftCount++;
                j = j-1; 
            } 
            arr[j+1] = key; 
            System.out.println(Arrays.toString(arr));
            insertionSwapCount++;
        } 
        System.out.println("Shift Count: " + shiftCount);
        return insertionSwapCount;
    } 
	
	void selectionSortTime(int arr[]){ 
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
    
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
	void bubbleSortTime(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]){ 

                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
	
	void insertionSortTime(int arr[]){ 
        int n = arr.length; 
        for (int i=1; i<n; ++i){ 
            int key = arr[i]; 
            int j = i-1; 
  
            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
	
	private static void fillArray(int[] arr) {
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = (arr.length-1)-i;
		}
	}
	
	

}
