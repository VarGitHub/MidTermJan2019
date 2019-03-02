package algorithm;

public class Sort {

    int executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
    //Bubble sort
	public int[] bubbleSort(int[] arr) {
        final int startTime = (int) System.currentTimeMillis();
        for (int i = arr.length-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }
    //Insertion sort
    public int[] insertSort(int[] arr) {
        final int startTime = (int) System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] >= temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }
    //Selection sort
    public int[] selectionSort(int [] array){
        final int startTime = (int) System.currentTimeMillis();
        int [] list = array;
        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //Merge sort
    public int[] mergeSort(int[] arr, int size) {
        final int startTime = (int) System.currentTimeMillis();
        if (size >= 2) {
            int mid =  size / 2;
            int[] left = new int[mid];
            int[] right = new int[size-mid];
            for (int i = 0; i < left.length; i++)
                left[i] = arr[i];
            for (int j = mid; j < size; j++)
                right[j-mid] =  arr[j];
            mergeSort(left, mid);
            mergeSort(right, size-mid);
            merge(arr, left, right, mid, size-mid);
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }
    public void merge(int[] arr, int[] left, int[] right, int low, int high){
        int i = 0, j= 0, k = 0;

        while ( i < low && j < high) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < low) {
            arr[k++] = left[i++];
        }
        while (j < high) {
            arr[k++] = right[j++];
        }

    }
    //Quick sort
    public int[] quickSort(int[] arr, int low, int high) {
        final int startTime = (int) System.currentTimeMillis();
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }
    public int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]  = temp;
        return i+1;
    }
    //Heap sort
    public int[] heapSort(int arr[]) {
        final int startTime = (int) System.currentTimeMillis();
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }
    public void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    //Shell sort
    public int[] shellSort(int[] arr) {
        final int startTime = (int) System.currentTimeMillis();
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        final int endTime = (int) System.currentTimeMillis();
        final int executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }






    /*public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }*/
}
