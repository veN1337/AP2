package sorting;
import java.util.EnumSet;

import static sorting.Algorithm.*;

public class Main {
           
    public static void main(String[] args) {
        int[] a = {7, 1, 6, 2, 3, 8, 4,  5};
        int[] sizes = { 100, 1000, 10000, 100000 };
        
        TestOfSortingAlgorithms.traceOf(
                EnumSet.of(SelectionSort, InsertionSort, MergeSort), a);
        TestOfSortingAlgorithms.performanceOf(
                EnumSet.allOf(Algorithm.class), sizes);
    }
}