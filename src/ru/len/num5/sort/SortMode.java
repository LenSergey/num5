package ru.len.num5.sort;

import java.util.Comparator;
import ru.len.num5.figure.*;
/**
 * Класс-сортировка.
 * В данном классе происходит
 * реализация всех видов сортировки.
 * @author joe
 */
public class SortMode implements Comparator<Figure>{
    
    private boolean sortUp;
    private int sortMode;
    
    /**
     * Конструктор принимает 2 аргумента,
     * которыми инициализирует поля объекта.
     */
    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }
    
    @Override
    public int compare(Figure f1, Figure f2) {
        int res=0;
        
        if (sortMode==0){
            if (f1.getId()>f2.getId()) res=1;
            else if (f1.getId()<f2.getId()) res=-1;
        }
        
        else if (sortMode==1){
            res=f1.getName().compareTo(f2.getName());
        }
        
        else if (sortMode==2){
            if (f1.getMax()>f2.getMax()) res=1;
            else if (f1.getMax()<f2.getMax()) res=-1;
        }
        
        else {
            res=f1.getDate().compareTo(f2.getDate());
        }
        
        if (sortUp) res*=(-1);
            return res;
            
    }    
}
