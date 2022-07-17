package laba10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldConvertNumberToOtherNumerationSystem() {
        Number number = new Number(NumerationSystemType._10, "5589");
        Number result = Solution.convertNumberToOtherNumerationSystem(
                number, NumerationSystemType._3);
        Assertions.assertEquals("Number{numerationSystem=_3, digit='21200000'}"
        , result.toString());
        System.out.println(result.toString());

    }
}