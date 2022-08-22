package com.nseit.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component

public class BubbleSort implements SortAlg{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
