package it.accentur.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    double[] array = {2.0, 4.0, 5.0, 7.0, 10.0};
    @Test
    public void binarySearchTest_returns_position_when_target_present(){
        double target = 7.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(3, pos);
    }
    @Test //fuori range a dx
    public void binarySearchTest_returns_minus_1_when_target_outside_right_range() {
        double target = 15.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(-1, pos);
    }
    @Test //fuori range a sx
    public void binarySearchTest_returns_minus_1_when_target_outside_left_range() {
        double target = 1.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(-1, pos);
    }
    @Test // un numero che non è presente ma è nel range
    public void binarySearchTest_returns_minus_1_when_target_is_present_but_not_found() {
        double target = 6.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(-1, pos);
    }
    @Test //fans condition first num
    public void binarySearchTest_returns_position_for_first_element() {
        double target = 2.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(0, pos);
    }
    @Test // fans condition last num
    public void binarySearchTest_returns_position_for_last_element() {
        double target = 10.0;
        int pos = BinarySearch.binarysearch(target, array);
        Assertions.assertEquals(4, pos);
    }
}
