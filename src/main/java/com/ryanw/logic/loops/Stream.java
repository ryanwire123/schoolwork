package com.ryanw.logic.loops;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 3, 4};

      Arrays.stream(arr).forEach(i -> {
        System.out.println(i);
      });
    }
}
