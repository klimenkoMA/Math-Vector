package laba4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatTest {
    List<String> list = new ArrayList<>();
    {
        list.add("Конечно");
        list.add("Лучше всего делать лабораторки вовремя");
        list.add("Однако в реальной жизни");
        list.add("Все делается в последний момент");
    }

    @Test
   public void shouldDoConcat() {
        String result = "КонечноЛучшевсегоделатьлабораторкивовремяОднаковреальнойжизниВседелаетсявпоследниймомент";
        Assertions.assertEquals(result, Concat.doConcat(list));
        System.out.println(Concat.doConcat(list));
    }
}