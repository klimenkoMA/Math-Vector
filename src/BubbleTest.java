import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleTest {

    int[] myArray  = {860,8,200,9};



    @Test
   public void shouldInsertionSort() {
        Bubble.insertionSort(myArray);
        Assertions.assertEquals(8,myArray[0]);
        Assertions.assertEquals(9,myArray[1]);
        Assertions.assertEquals(200,myArray[2]);
        Assertions.assertEquals(860,myArray[3]);

    }

}