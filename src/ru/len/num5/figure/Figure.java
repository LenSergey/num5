package ru.len.num5.figure;

import java.text.*;
import java.util.*;
import ru.len.num5.interfaces.*;

/**
 * Класс-фигура(абстрактный).
 * Класс-родитель классов Rhomb,Semicircle, Square, Trapeze.
 * @author joe
 */
public abstract class Figure implements Perimeter, Area{
    String name="Фигура";
    int id;
    private static int nextId=1;
    { id = nextId++; }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
    String date = sdf.format(new Date());
        
    /**
     * @return Возвращает значение ID фигуры.
     */
    public abstract int getId();
    
    /**
     * @return Возвращает значение даты.
     */
    public abstract String getDate();
    
    /**
     * @return Возвращает наименование фигуры.
     */
    public abstract String getName();  
    
    /**
     * @return Возвращает значение максимальной стороны фигуры.
     */
    public abstract double getMax();
    
}    
