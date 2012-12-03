package ru.len.num5.figure;

/**
 * Класс-полукруг.
 * Задается 1 параметром - радиусом.
 * @author joe
 */
public class Semicircle extends Figure {
    private double r;
    
    /**
     * Конструктор принимает аргумент,
     * которым инициализирует поле объекта.
     */
    public Semicircle(double r){ //  конструктор
        name="Полукруг";
        this.r=r;
    } 

    @Override
    public int getId(){
        return id;
    }

    @Override
    public double getMax(){
        if (getArc()>r)
            return getArc();
        return r;
    }

    @Override
    public String getName(){
        return name;
    }
    
    /**
     * @return Возвращает значение радиуса полукруга.
     */
    public double getR(){
        return r;
    }
    
    /**
     * @return Возвращает значение длины дуги полукруга.
     */
    public double getArc(){
        return Math.PI*r;
    }

    @Override
    public double per() {
        return 2*r+getArc();
    }

    @Override
    public double area() {
        return (Math.PI*r*r)/2;
    }
    
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", радиус="+this.getR()+", длина дуги="+Math.round(this.getArc()*100)/100f+", периметр="+Math.round(this.per()*100)/100f+", площадь="+Math.round(this.area()*100)/100f;
    }    
}