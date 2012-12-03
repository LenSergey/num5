package ru.len.num5.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.len.num5.figure.*;

public class RhombTest {

    @Test
    public void testDiag2() {
        System.out.println("Проверка метода getDiag2()");
        Rhomb r = new Rhomb(5,6);
        assertEquals(8, r.getDiag2(),0.00001);
    }
    
    @Test
    public void testMax() {
        System.out.println("Проверка метода getMax()");
        Rhomb r = new Rhomb(6,8);
        assertEquals(6, r.getMax(),0.00001);
    }
    
    @Test
    public void testPer() {
        System.out.println("Проверка метода per()");
        Rhomb r = new Rhomb(3,5);
        assertEquals(12, r.per(),0.00001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Rhomb r = new Rhomb(10,16);
        assertEquals(96, r.area(),0.00001);
    }
}

