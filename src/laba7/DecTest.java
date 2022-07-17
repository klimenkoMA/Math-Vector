package laba7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.*;

class DecTest {

    Dec states =  new Dec();

    {
        states.add("Germany");
        states.add("Japan");
        states.add("USA");
        states.add("Turkey");

    }

    @Test
    public void shouldAddFirst() {
        states.addFirst("France");
        Assertions.assertEquals("France",
                states.getFirst());
        System.out.println(states.getFirst());

    }

    @Test
    public void shouldPush() {
        states.push("Canada");
        Assertions.assertEquals("Canada",
                states.getFirst());
        System.out.println(states.getFirst());
    }

    @Test
    public void shouldRemove() {
        states.remove("Japan");
        assertFalse(states.contains("Japan"));
        for (String s: states
             ) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}