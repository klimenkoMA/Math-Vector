import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.*;

public class VectorLibTest {

    VectorLib v = new VectorLib(3, 2);

    {
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(11);
        v.addElement(12);
    }

    @Test
    public void shouldBeCapacity() {
        Assertions.assertEquals(7,v.capacity());
        System.out.println("Capacity is " + v.capacity());
    }

    @Test
    public void shouldBeSize() {
        Assertions.assertEquals(6,v.size());
        System.out.println("Size is " + v.size());
    }

    @Test
    public void shouldBeIsEmpty() {
        Assertions.assertNotEquals(0,v.size());
        System.out.println("Not empty, has " + v.size()+ " elements");
    }

    @Test
    public void shouldBeContains() {
        assertTrue(v.contains(11));
        System.out.println("Contains " + 11);
    }

    @Test
    public void shouldBeFirstElement() {
        Assertions.assertEquals(1, v.firstElement());
        System.out.println("First element is " + v.firstElement());
    }

    @Test
    public  void shouldBeLastElement() {
        Assertions.assertEquals(12, v.lastElement());
        System.out.println("Last element is " + v.lastElement());
    }

    @Test
    public  void shouldBeElementAt() {
        Assertions.assertEquals(3, v.elementAt(2));
        System.out.println("Element with index 2 is " + v.elementAt(2));
    }

    @Test
    public  void shouldBeAddElement() {
        v.addElement(15);
        Assertions.assertEquals(true,v.contains(15));
        System.out.println("Element 15 was added");
    }

    @Test
    public void shouldBeRemoveElement() {
        v.removeElement(3);
        Assertions.assertEquals(false,v.contains(3));
        System.out.println("Element 3 was removed");
    }

    @Test
    public void shouldBeGet() {
        Assertions.assertEquals(4,v.get(3));
        System.out.println("Element 4 has index 3");
    }

    @Test
    public  void shouldBeSet() {
        v.set(3,8);
        Assertions.assertEquals(8,v.get(3));
        System.out.println("Element 4 has exchanged for 8");
        Enumeration vEnum = v.elements();
        System.out.println("Элементы в векторе:");

        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }

}