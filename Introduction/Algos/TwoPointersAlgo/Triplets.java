package Algos.TwoPointersAlgo;

import java.util.*;

class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter value of n ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter array elements ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Triplet g = new Triplet();
            if (g.findTriplets(a, n))
                System.out.println("1");
            else
                System.out.println("0");
        }

        sc.close();
    }

}

class Triplet {
    public boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        System.out.println("sorter array is ");
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.println("i = " + i);

            if (twoSum(arr, -arr[i], i + 1)) {
                System.out.println("Done");
                return true;
            }
        }
        return false;
    }

    public boolean twoSum(int a[], int x, int i) {
        int j = a.length - 1;
        System.out.println("j = " + j + " i = " + i + " x = " + x);
        while (i < j) {
            if (a[i] + a[j] > x) {
                j--;
            } else if (a[i] + a[j] < x) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
