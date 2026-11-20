package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainTest {

    @Test
    public void GradeTest(){
        assertEquals("b",Main.grade(90));
    }
}
