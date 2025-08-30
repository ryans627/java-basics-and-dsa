package com.ryans.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intro {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "b", "cdasdas", "adasdsadasd");
        List<String> result = input.stream().filter(n -> n.length() < 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
