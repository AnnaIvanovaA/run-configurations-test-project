package org.example;

import java.nio.file.Path;

import static java.lang.System.getenv;

public class EnvironmentVariablesInFiles {
    public static final String EXPECTED_VALUE = "abc#123#missing-trailing-value";

    public static void main(String[] args) {
        String variable = getenv("EXAMPLE_ENVIRONMENT_VARIABLE");
        if (variable == null) {
            System.err.println("Run > Edit Configuration and add this as a file to Environment variables:\n" + Path.of("environment").toAbsolutePath());
            return;
        }
        if (variable.equals(EXPECTED_VALUE)) {
            System.out.println("Hurrah! Problem is fixed");
            return;
        }
        System.err.println("Expected variable to be read as [" + EXPECTED_VALUE + "] but was [" + variable + "]");
    }
}
