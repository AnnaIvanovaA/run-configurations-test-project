package org.example;

public class InfiniteTyping {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            System.out.print("I'm still alive: ");
            System.out.println(i);
            System.err.println("BLAH");
        }
    }
}
