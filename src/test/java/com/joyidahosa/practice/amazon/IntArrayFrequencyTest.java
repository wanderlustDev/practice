package com.joyidahosa.practice.amazon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntArrayFrequencyTest {

    @Test
    public void testFrequencyArray() {
        int[] array = {2, 3, 3, 5, 3, 4, 1, 7};
        IntArrayFrequency frequency = new IntArrayFrequency();
        assertEquals(3, frequency.getMostFrequentNumber(array));
    }

    @Test
    public void testRemoveDuplicate() {
        int[] array = {1, 2, 4, 8, 7, 9, 2, 8, 3, 9, 4, 7, 0, 8, 5, 6, 7, 1, 8, 8, 4};
        IntArrayFrequency frequency = new IntArrayFrequency();
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(expected, frequency.removeDuplicates(array));
    }
}
