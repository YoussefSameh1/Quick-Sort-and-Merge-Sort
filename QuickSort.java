package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort implements Sortable {
    
    public static void swap1(ArrayList<Integer> arr, int i, int j) {
        Collections.swap(arr, i, j);
    }
    @Override
    public void sort(ArrayList<Integer> list){
        quickSort(list, 0, list.size()-1);
    }

    public void quickSort(ArrayList<Integer> arr, int i, int h) {
        if (i < h) {
            int piv = partition(arr, i, h);
            quickSort(arr, i, piv - 1);
            quickSort(arr, piv + 1, h);
        }
    }
    
    int partition(ArrayList<Integer> arr, int iBegin, int jEnd) {
        int i = iBegin;
        int j = jEnd;
        int pivLoc = i;
        while (true) {
            while (i < j && arr.get(i) >= arr.get(pivLoc)) {
                i++;
            }
            while (arr.get(j) < arr.get(pivLoc)) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap1(arr, i, j);
        }
        swap1(arr, pivLoc, j);
        return j;
    }
}