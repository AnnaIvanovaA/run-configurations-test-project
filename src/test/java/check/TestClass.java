package check;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("worksssssssss");
        System.out.println("dsfsdf");
        for (int i = 0; i < 1000; i++) {
            System.out.println("ff");
            sleep(10);
        }
    }

    @Test
    public void underscore_method(){

    }
}
