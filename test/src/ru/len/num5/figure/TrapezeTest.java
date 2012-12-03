package ru.len.num5.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.len.num5.figure.*;

public class TrapezeTest {

    @Test
    public void testMax() {
        System.out.println("Проверка метода getMax()");
        Trapeze t = new Trapeze(9,7,7,5);
        assertEquals(9, t.getMax(),0.0001);
    }
    
    @Test
    public void testRight() {
        System.out.println("Проверка метода getRight()");
        Trapeze t = new Trapeze(5,3,4,2);
        assertEquals(2.35, t.getRight(),0.1);
    }
    
    @Test
    public void testPer() {
        System.out.println("Проверка метода per()");
        Trapeze t = new Trapeze(7,4,5,3);
        assertEquals(19.068, t.per(),0.01);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Trapeze t = new Trapeze(12,6,5,5);
        assertEquals(42.5, t.area(),0.01);
    }
}

