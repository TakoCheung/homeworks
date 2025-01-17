package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SlidingWindowTest {
  private SlidingWindow slidingWindow = new SlidingWindow();

  @Test
  public void testFindMaxAverage() {
    assertEquals(12.75000, slidingWindow.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
    assertEquals(2.00000, slidingWindow.findMaxAverage(new int[] { 0, 1, 1, 3, 3 }, 4));
    assertEquals(-594.58065,
        slidingWindow.findMaxAverage(new int[] { 8860, -853, 6534, 4477, -4589, 8646, -6155, -5577, -1656, -5779, -2619,
            -8604, -1358, -8009, 4983, 7063, 3104, -1560, 4080, 2763, 5616, -2375, 2848, 1394, -7173, -5225, -8244,
            -809, 8025, -4072, -4391, -9579, 1407, 6700, 2421, -6685, 5481, -1732, -8892, -6645, 3077, 3287, -4149,
            8701, -4393, -9070, -1777, 2237, -3253, -506, -4931, -7366, -8132, 5406, -6300, -275, -1908, 67, 3569, 1433,
            -7262, -437, 8303, 4498, -379, 3054, -6285, 4203, 6908, 4433, 3077, 2288, 9733, -8067, 3007, 9725, 9669,
            1362, -2561, -4225, 5442, -9006, -429, 160, -9234, -4444, 3586, -5711, -9506, -79, -4418, -4348, -5891 },
            93));
  }

  @Test
  public void testLengthOfLongestSubstring2() {
    assertEquals(3, slidingWindow.lengthOfLongestSubstring2("abcabcbb"));
  }

  @Test
  public void testMinWindow() {
    assertEquals("BANC", slidingWindow.minWindow("ADOBECODEBANC", "ABC"));
    assertEquals("a", slidingWindow.minWindow("a", "a"));
  }

  @Test
  public void testMaxVowels() {
    assertEquals(3, slidingWindow.maxVowels("abciiidef", 3));
    assertEquals(0, slidingWindow.maxVowels("rhythms", 4));
    assertEquals(4, slidingWindow.maxVowels("weallloveyou", 7));
    assertEquals(7, slidingWindow.maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));
  }

  @Test
  public void testCheckInclusion() {
    assertTrue(slidingWindow.checkInclusion("eidbaooo", "ab"));
    assertFalse(slidingWindow.checkInclusion("eidboaoo", "ab"));
  }

  @Test
  public void testLongestOnes() {
    assertEquals(5, slidingWindow.longestOnes(new int[]{1,1,0,0,0,1,1,1,0,1,1,1,1,1,0,0,0,0,0}));
    assertEquals(10, slidingWindow.longestOnes(new int[]{1,1,0,0,0,1,1,1,0,1,1,1,1,1,0,0,0,0,0}, 2));
    assertEquals(10, slidingWindow.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    assertEquals(6, slidingWindow.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
  }

  @Test
  public void testMaxPower() {
    assertEquals(5, slidingWindow.maxPower("abbcccddddeeeeedcba"));
  }

  @Test
  public void testMaxSubArray() {
    assertEquals(6, slidingWindow.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    assertEquals(1, slidingWindow.maxSubArray(new int[]{1}));
    assertEquals(23, slidingWindow.maxSubArray(new int[]{5,4,-1,7,8}));
  }

  @Test
  public void testMaxTurbulenceSize() {
    assertEquals(5, slidingWindow.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
    assertEquals(2, slidingWindow.maxTurbulenceSize(new int[]{4,8,12,16}));
    assertEquals(7, slidingWindow.maxTurbulenceSize(new int[]{8,8,9,10,6,8,2,4,2,2,10,6,6,10,10,2,3,5,1,2,10,4,2,0,9,4,9,3,0,6,3,2,3,10,10,6,4,6,4,4,2,5,1,4,1,1,9,8,9,5,3,5,5,4,5,5,6,5,3,3,7,2,0,10,9,7,7,3,5,1,0,9,6,3,1,3,4,4,3,6,3,2,1,4,10,2,3,4,4,3,6,7,6,2,1,7,0,6,8,10}));
  }

  @Test
  public void testLengthOfLongestSubstring() {
    assertEquals(3, slidingWindow.lengthOfLongestSubstring("abcabcbb"));
    assertEquals(1, slidingWindow.lengthOfLongestSubstring("bbbbb"));
    assertEquals(3, slidingWindow.lengthOfLongestSubstring("pwwkew"));

    assertEquals(3, slidingWindow.lengthOfLongestSubstring2("abcabcbb"));
    assertEquals(1, slidingWindow.lengthOfLongestSubstring2("bbbbb"));
    assertEquals(3, slidingWindow.lengthOfLongestSubstring2("pwwkew"));

  }
}
