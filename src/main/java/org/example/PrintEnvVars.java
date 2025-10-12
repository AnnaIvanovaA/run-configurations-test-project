package org.example;

import java.util.Map;

public class PrintEnvVars {
    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        // get PATH environment variable
        String myEnv = System.getenv("STORAGE_BUCKET_NAME");
        System.out.println("__" + myEnv);
System.out.println();
        System.out.println("test var: " + System.getenv("test"));
        System.out.println("semicolon: " + System.getenv("semicolon"));
        System.out.println("_______________________________");

        //get all env vars
        for (String value : env.values()) {
            System.out.println(value);
        }
    }
}
