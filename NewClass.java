package com.mycompany.mavenproject1;

import javax.swing.*;
import java.util.ArrayList;

public class NewClass {
    public static void main(String[] args){
        while (true) {

            ArrayList<Integer> list = new ArrayList<>();

            String sizeInput = JOptionPane.showInputDialog(null, "Enter size of the list:");
            int n = Integer.parseInt(sizeInput);

            for(int i = 0; i < n; i++){
                String elementInput = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + " of the list:");
                int x = Integer.parseInt(elementInput);
                list.add(x);
            }

            String[] options = {"QuickSort", "MergeSort"};
            int choice = JOptionPane.showOptionDialog(null, "Choose the sorting method:",
                    "Sorting Method",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

            Sortable sorter;
            switch (choice) {
                case 0:
                    sorter = new QuickSort();
                    break;
                case 1:
                    sorter = new MergeSort();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong choice...");
                    continue;
            }
            sorter.sort(list);

            JOptionPane.showMessageDialog(null, "Sorted array in descending order: " + list);

            int continueChoice = JOptionPane.showConfirmDialog(null, "Do you want to enter another array?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (continueChoice != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}