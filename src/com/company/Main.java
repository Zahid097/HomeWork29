package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] arrays = {4234,34634,356356,345,3423,4523,423,468,23};
        Arrays.stream(arrays).filter(x -> x % 2 == 0).map(x -> x * x)
                .max(Integer :: compare).ifPresent(System.out::println);
    }
}
