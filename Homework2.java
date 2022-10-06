package Lessen2;

import java.util.Scanner;

public class Homework2 {
    //  09/27

    public static void main(String[] args) {


        //First level: С консоли считывается 3 оценки, которые Петя получил сегодня в школе.
        // Помогите ему посчитать свой средний балл, выведя его на экран

        //Second level: Петя вырос и накопил денег на поезду на море.
        // Но он переживает, стоит ли туда ехать.
        // Если температура воздуха будет больше, чем 28 градусов,
        // а температура воды больше 26 - тогда он готов поехать на море, иначе нет.
        //В программу вводится 2 числа - температура воздуха и воды.
        // Используя boolean переменные,
        // выведите на экран true - если Петя готов ехать на море, и false - если не готов

        Scanner s = new  Scanner (System.in);
        int grade = s.nextInt();    //оценка
        // s - это имя сканера (как мы его назвал)
        int grade1 = s.nextInt();   //оценка 1
        int grade2 = s.nextInt();   //оценка2
        System.out.println( (grade + grade1 + grade2) / 3 ); // вывод среднего значения



        int t_air = 27 ;
        int t_water = 27;

        boolean rigt = t_air > 28 ;
        boolean rigt2 = t_water > 26;
        boolean  does_not_go = false ;
        boolean  go = true ;
        boolean   answer = rigt || rigt2 ;


        System.out.println( answer );

    }
}
