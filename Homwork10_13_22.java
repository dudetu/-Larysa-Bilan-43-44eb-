package Homwork10_13_22;
import java.util.Scanner;
public class Homwork10_13_22 {
    public static void main(String[] args) {

        // First level: Вводится число. Напишите на экран сообщение
        // "Я начинаю разбираться с циклами" количество раз, равное этому числу


        // Second level: В программу вводится 1 число.
        // ыведите на экран его факториал, используя цикл while
        // https://math-prosto.ru/ru/pages/factorial/factorial/
        Scanner scanner = new Scanner(System.in);

     //   int max = scanner.nextInt();
   //int  a = 0  ;
    //  while ( a < max) {
     //     System.out.println(   " Я начинаю разбираться с циклами");
      // a++;
    //  }
       int   x = scanner.nextInt();// произвольное число
          int a=1; //счетчик целых чисел
             int fact =1;
               while ( a <= x ){

                   fact *=a;
                   a++;
            System.out.println( fact );


}







    }
}
