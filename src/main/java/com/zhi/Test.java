package com.zhi;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] words = {"i","heard","about","spark","and","i","love","spark"};
        System.out.println(words[0].hashCode()%2000);
    }
}
