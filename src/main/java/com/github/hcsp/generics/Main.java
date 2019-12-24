package com.github.hcsp.generics;

public class Main {
    public static <T extends Comparable> boolean inAscOrder(T a, T b, T c) {
        return a.compareTo(b) < 1 && b.compareTo(c) < 1;
    }

    public static void main(String[] args) {
        System.out.println(inAscOrder(1, 2, 3));
        System.out.println(inAscOrder(1L, 2L, 3L));
        System.out.println(inAscOrder(1d, 2d, 3d));
    }
}
