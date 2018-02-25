package com.nickwongdev;

import java.util.Random;

public class NullCases {

    private static final String TEST_STRING = "test-string";
    private static final Random RANDOM = new Random();

    private String nullableString;
    private String nonNullString = "";

    public String getAnnotated() {
        return null;
    }

    public String getDefaulted() {
        return null;
    }

    public String getString() {
        return TEST_STRING;
    }

    public String getRandomString() {
        if (RANDOM.nextBoolean()) {
            return TEST_STRING;
        }
        return null;
    }

    public void setNullableString(final String input) {
        this.nullableString = input;
    }

    public void setNonNullString(final String input) {
        this.nonNullString = input;
    }

    public String getNullableString() {
        return nullableString;
    }

    public String getNonNullString() {
        return nonNullString;
    }
}
