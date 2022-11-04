package Homwork10_25_22;

import java.util.Arrays;
import java.util.Scanner;

public class Hommwork10_25_22 {

    public static void main(String[] args) {



        //First level: level1:
        //Создайте массив размером 100 символов,
        // заполните все ячейки значением 10.
        // 1 и 99 ячейки заполните значениями, равными 0
        //
        //
        //level2:
        //Создайте массив размером 100 символов,
        // заполните все ячейки согласно такому правилу:
        // 1 ячейка - 111, 2ая - 222, 3ая - 333,….
        // 11ая - 111, 12ая - 222, 13ая - 333.
        // Найдите сумму значений всех ячеек

int[]rocetTemp = new int[100];
        for ( int i = 1; i < 100; i++ ){
            rocetTemp[i] =10;
            rocetTemp[99]=0;

        }
        System.out.println(Arrays.toString(rocetTemp));
        int summa =0;

        for ( int i = 0; i< 100; i++ ) {

            rocetTemp[i] =i%10* 111;


            summa = summa + rocetTemp[i] ;

        }
        System.out.println(Arrays.toString(rocetTemp));
        System.out.println(summa);

    }

}
