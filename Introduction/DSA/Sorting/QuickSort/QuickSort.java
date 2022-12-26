package DSA.Sorting.QuickSort;

public class QuickSort {

    public static void quicksort(int a[], int low, int high) {

        if(low < high) {
            int pi = partition(a, low, high);

            quicksort(a, low, pi-1);
            quicksort(a, pi+1, high);
        }

    }

    /** This function takes last element as pivot, places the pivot element at its correct position in sorted array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    public static int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int i = low-1;

        for(int j = low; j <= high-1; j++) {
            if(a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);

        return i+1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int []a = {6, 5, 3, 2, 1};

        quicksort(a, 0, 4);

        for (int i : a) {
            System.out.print(i + " ");
            
        }
    }
}
