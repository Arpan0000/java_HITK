public class StringSort extends Thread {
    private String arr[];
    StringSort(String arr[]){
        this.arr=arr;
    }
    @Override
    public synchronized void run() {
        int n = 5;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if ((arr[j].compareTo(arr[j + 1]) > 0) ) {
                    // Swap if elements are in the wrong order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
