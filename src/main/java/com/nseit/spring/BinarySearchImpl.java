package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlg bubbleSort;


    public void setBubbleSort(SortAlg bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
        //BubbleSort bubbleSort = new BubbleSort();
        //QuickSort quicksort = new QuickSort();

        int[] sortedNumber = bubbleSort.sort(numbers);
        System.out.println(bubbleSort);
        return 12;
    }
}
