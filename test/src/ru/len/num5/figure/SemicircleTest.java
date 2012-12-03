package ru.len.num5.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.len.num5.figure.*;

public class SemicircleTest {

    @Test
    public void testDiag() {
        System.out.println("Проверка метода getArc()");
        Semicircle s = new Semicircle(9);
        assertEquals(28.27433, s.getArc(),0.001);
    }

    @Test
    public void testPer() {
        System.out.println("Проверка метода per()");
        Semicircle s = new Semicircle(6);
        assertEquals(30.84955, s.per(),0.001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Semicircle s = new Semicircle(3);
        assertEquals(14.13716, s.area(),0.001);
    }
}

