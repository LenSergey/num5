package ru.len.num5.figure;

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
        
    /**
     * @return Возвращает значение ID фигуры.
     */
    public abstract int getId();
    
    /**
     * @return Возвращает наименование фигуры.
     */
    public abstract String getName();  
    
    /**
     * @return Возвращает значение максимальной стороны фигуры.
     */
    public abstract double getMax();
       
}    
