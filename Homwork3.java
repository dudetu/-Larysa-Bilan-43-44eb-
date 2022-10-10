package Homwork.Lessen3_09_29_22;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Homwork3 {
    // 09_29_22
    public static void main(String[] args) {

        //   First level: 1) В программу (в консоль) вводится строка.
        //   Найдите длину строки, если она больше 10, то выведите true, иначе false

        //2) В программу (в консоль) вводится строка.
        // Если первый и последний символ равны - выведите true, иначе false
        //Second level: В программу вводится строка из двух букв A и B,
        // замените все буквы A на B, а все B на A. Например ABBA -> BAAB

        Scanner scanner = new Scanner(System.in);

       String s =scanner .nextLine();

        s  = s.replace('A', 'O'  )
                           .replace('B', 'A'  )
                .replace('O', 'B'  );
        System.out.println(  s );


       int size = s.length();  //длина строки

     //   boolean answer = size > 10;
       // System.out.println( answer );


        char first = s.charAt(0); // определение первого символа

        char second = s.charAt(size - 1); // определение последнего символа

        boolean answer = (first == second ); // false || true
        System.out.println( answer );



    }
}
