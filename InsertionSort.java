// Java program for implementation of Insertion Sort 
class InsertionSort { 
    /*Function to sort array using insertion sort*/
    public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int current = array[i];
        int j = i - 1;
        while(j >= 0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        array[j+1] = current;
    }
}

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort insertionSort = new InsertionSort(); 
        insertionSort.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + ", ");
        }
    } 
}
