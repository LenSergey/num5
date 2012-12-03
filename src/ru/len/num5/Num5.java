package ru.len.num5;

import java.io.*;
import java.util.*;
import ru.len.num5.figure.*;
import ru.len.num5.sort.*;

/**
 * Главный класс
 * @author joe
 */
public class Num5 {
    private static List<Figure> list;
    
    private static void init()throws IOException{
        double a,b,c,r;        Scanner n = new Scanner(System.in);
        System.out.println("1 - Добавить объект");
        System.out.println("2 - Удалить объект");
        String key = n.next();
        if(key.equals("1")){
            InputStreamReader isp = new InputStreamReader(System.in);
            BufferedReader bp = new BufferedReader(isp);
            System.out.println("-------------------------------");
            System.out.println("Выберите объект");
            System.out.println("1 - Квадрат");
            System.out.println("2 - Ромб");
            System.out.println("3 - Трапеция");
            System.out.println("4 - Полукруг");
            String keyMenu = n.next();
            switch (keyMenu){
                case "1": 
                    System.out.println("-------------------------------");
                    System.out.println("Укажите сторону: ");
                    r = n.nextDouble();
                    list.add(new Square(r));break;
                case "2": 
                    System.out.println("-------------------------------");
                    System.out.println("Укажите сторону: ");
                    r = n.nextDouble();
                    System.out.println("Укажите диагональ: ");
                    a = n.nextDouble();
                    list.add(new Rhomb(r,a));break;
                case "3": 
                    System.out.println("-------------------------------");
                    System.out.println("Укажите нижнее основание: ");
                    a = n.nextDouble();
                    System.out.println("Укажите левую боковую: ");
                    b = n.nextDouble();
                    System.out.println("Укажите верхнее основание: ");
                    c = n.nextDouble();
                    System.out.println("Укажите высоту: ");
                    r = n.nextDouble();
                    list.add(new Trapeze(a,b,c,r));break;
                case "4": 
                    System.out.println("-------------------------------");
                    System.out.println("Укажите радиус: ");
                    r = n.nextDouble();
                    list.add(new Semicircle(r));break;
            }
        }
        
        else if(key.equals("2")){
            int del;
            System.out.println("----------------------------");
            System.out.println("Удаление объекта");
            System.out.println("Укажите Id объекта");
            del=n.nextInt();
                for(Figure f: list){
                    if(del==f.getId()){del=list.indexOf(f);break;}
                }
            list.remove(del);
        }    
    }
    
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        list=new ArrayList<>();
        Scanner n = new Scanner(System.in);
        for (;;) {
            System.out.println();
            System.out.println("Выберите действие(q - выход):");
            System.out.println("----------------------------------------------");
            System.out.println("0 - добавить/удалить объект");
            System.out.println("1 - сортировка по возраcтанию id");
            System.out.println("2 - сортировка по убыванию id");
            System.out.println("3 - сортировка по возраcтанию имени");
            System.out.println("4 - сортировка по убыванию имени");
            System.out.println("5 - сортировка по наибольшей стороне по возрастанию");
            System.out.println("6 - сортировка по наибольшей стороне по убыванию");
            System.out.println("----------------------------------------------");
            String mode = n.next(); // читаем строку из буфера ввода
            if (mode.equals("q")) break; // прерываем цикл, если строка пустая    
            else if(mode.equals("0")){
                init();
            }  
            else { boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6");
                int sortMode=0;
                if (mode.equals("3")||mode.equals("4")) sortMode=1;
                else if (mode.equals("5")||mode.equals("6")) sortMode=2;
                Collections.sort(list,new SortMode(sortUp,sortMode));
                for(Figure f: list){
                    System.out.println(f);
                }
            }
        }
    }      
}
