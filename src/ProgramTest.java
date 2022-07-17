import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {

    int N = 3;
    int[] a = new int[]{1, 3, -5, 0, 4, 6, -1, 9, 3, 2};

    @Test
    public void shouldSum() {
        Assertions.assertEquals(-1, Program.sum(a, N));
        System.out.println("Testing sum is " + Program.sum(a, N));
    }

    @Test
    public void shouldReadInt() throws IOException {
        int s = 98564;
        Assertions.assertEquals(98564, Program.readInt());
    }
}