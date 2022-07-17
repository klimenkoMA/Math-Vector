package laba3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    int x = 3;
    int y = -1;

    @Test
    public void shouldCounting() {
        Assertions.assertEquals(3, App.counting(x, y));
        System.out.println("Result is " + App.counting(x, y));
    }
}