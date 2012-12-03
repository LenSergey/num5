package ru.len.num5.figure;

/**
 * Класс-квадрат.
 * Задается 1 параметром - стороной.
 * @author joe
 */
public class Square extends Figure {
    private double a; 
    
    /**
     * Конструктор принимает аргумент,
     * которым инициализирует поле объекта.
     */
    public Square(double a){ 
        name="Квадрат";
        this.a=a;
    } 
    
    @Override
    public double getMax(){
        return a;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    /**
     * @return Возвращает значение стороны квадрата.
     */
    public double getSide(){
        return a;
    }
    
    /**
     * @return Возвращает значение диагонали квадрата.
     */
    public double getDiag(){
        return Math.sqrt(a*a+a*a);
    }

    @Override
    public double per() {
        return 4*a;
    }

    @Override
    public double area() {
        return a*a;
    }
    
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", сторона="+this.getSide()+",диагональ="+Math.round(getDiag()*100)/100f+", периметр="+Math.round(this.per()*100)/100f+", площадь="+Math.round(this.area()*100)/100f;
    }    
}

