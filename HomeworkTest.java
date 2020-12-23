import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTest {

    @Test
    public void task1() {
        assertEquals(16,Homework.task1(4,4));
    }

    @Test
    public void task2() {assertEquals("Точка принадлежит первой четверти ",Homework.task2(5,8));
    }

    @Test
    public void task3() {assertEquals(3,Homework.task3(1,1,1));
    }
}