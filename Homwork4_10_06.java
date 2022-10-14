         package Homwork4_10_06_22;
         import java.util.Scanner;
       public class Homwork4_10_06 {
           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               //  С консоли считывается число. Если это число равно 0 -
               //  тогда напишите на экран "ошибок не обнаружено",
               //  если число не равно 0, тогда выведите три сообщения "ERROR"
               //
               //Second level: С консоли считывается строка,
               // если эта длина этой строки меньше 6 или последний символ НЕ '!',(не истина)
               // тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"

                 int namber = scanner.nextInt();
                if (namber == 0) {
                      System.out.println(" Ошибок не обнаружено ");
                 }
                 if (namber > 0) {
                      System.out.println(" ERROR  ERROR  ERROR    ");
                 }
                 if (namber < 0) {
                     System.out.println(" ERROR ERROR  ERROR  ");
                  }

             //  String s = scanner.nextLine();// длина строки
            //   int size = s.length();

             //  if ( size < 6) {
             //    System.out.println(" Пароль не верный ");

          //     }
             //      if (size > 6) {
              //    System.out.println(   size  + ""  +"  пароль принят");

      //        }


           }


          }




