package com.company.functional;

import java.util.function.Function;

public class Greet implements Function<String, String> {
    @Override
    public String apply(String s) {
        return "Hello "+s;
    }
}
