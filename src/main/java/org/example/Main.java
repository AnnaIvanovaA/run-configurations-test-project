package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello world!");
        Thread.sleep(1000);
        System.in.read();
        System.out.println();
    }
}
