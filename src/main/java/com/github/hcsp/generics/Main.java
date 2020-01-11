package com.github.hcsp.generics;

public class Main {
    // 这里有四个结构、功能非常相似的方法，请尝试将其范型化，以简化代码
    // 范型化之后的方法签名应该如下所示：
    public static <T extends Comparable> boolean inAscOrder(T a, T b, T c) {
        return a.compareTo(b) <= 0 && b.compareTo(c) <= 0;
    }
}
