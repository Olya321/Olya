import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Home on 23.12.2020.
 */
public class HomeworkPart2Test {
    @Test
    public void sumAndCount() throws Exception {assertEquals("Количество четных чисел равно 49,а сумма равна 2450",HomeworkPart2.sumAndCount());


    }

    @Test
    public void factorial() throws Exception {
        assertEquals(6,HomeworkPart2.Factorial(3));

    }

    @Test
    public void sumNum() throws Exception {
        assertEquals(13,HomeworkPart2.sumNum(49));

    }

}