package org.wikipedia;

public class MainClass {

        public static void main (String[] args ){
            // ДЗ.22 - 09
            int n = 3 ;
            System.out. println ( n  + " школьников " ) ;
            int k = 14 ;
            System.out. println ( k  + " количество  яблок ") ;

            int sum = 14 % 3;
            System. out.println ( 14 % 3  + " - остаток ") ;

            //The next number for the number ( следующее число за номером)
            k = k-1;
            System.out. println  ( " The next number for the number  13 is 14 . - " + k ) ;
            System.out. println ( k );
            // The previous number for the number (предыдущее  число за номером)
            k = k+1;
            System.out. println (  " The previous number for the number  14 is 13 . -" +  k );
            System.out. println ( k );

            // сколько десятков
            int d = 14 / 10 ;
            System.out. println ( 14 / 10   +  "  - сколько десятков ") ;



        }
    }