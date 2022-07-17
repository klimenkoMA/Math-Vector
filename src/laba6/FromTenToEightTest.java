package laba6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FromTenToEightTest {

    int oct_num[] = new int[100];
    int i = 1;
    int quot = 1854;


    @Test
    public void shouldGetI() {

        int number = FromTenToEight.getI(quot, i, oct_num);
        Assertions.assertEquals(5, number);

        String result = "";
        for (int j = number - 1; j > 0; j--) {
            result+=oct_num[j];
        }
        Assertions.assertEquals(3476,
                Integer.parseInt(result));
        System.out.print("Octal number is: " + result);
        System.out.print("\n");
    }
}