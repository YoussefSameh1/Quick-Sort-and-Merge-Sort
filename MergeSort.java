package com.mycompany.mavenproject1;

import java.util.ArrayList;


public class MergeSort implements Sortable {
    @Override
    public void sort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
            ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

            sort(left);
            sort(right);

            merge(list, left, right);
        }
    }

    private void merge(ArrayList<Integer> array, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) >= right.get(j)) { // For descending order
                array.set(k++, left.get(i++));
            } else {
                array.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            array.set(k++, left.get(i++));
        }

        while (j < right.size()) {
                array.set(k++, right.get(j++));
        }
    }
}