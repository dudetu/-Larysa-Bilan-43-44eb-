package Homwork10_18_22;
import java.util.Scanner;
public class Homwork10_18_22

{public static void main(String[] args) {

    // Дано целое число, не меньшее 2.
    // Выведите его наименьший делитель, отличный от 1.
    // (число, на которое введенное число делится без остатка).


    //  Level2
    //  Вклад в банке составляет x рублей.
   //  Ежегодно он увеличивается на p процентов,
    // после чего дробная часть копеек отбрасывается.
  //  Каждый год сумма вклада становится больше.
    // Определите, сколько будет на счету через k лет


    //  int number =15;
    //  int i = 2;
    //   boolean isFinished = false;
//  do {
    //    if ( number % i == 0) {
    //      System.out.println(i);
    //      isFinished = true;
    //   }
    // i++;
    //  } while (!isFinished == false);

    Scanner scanner = new Scanner(System.in);

    int x =scanner.nextInt();
    for (int i=2; i <= x; i++){
        if (x % 1 == 0){
            System.out.println( "x делится на " +1);
        }
    }






   int summa = scanner.nextInt();// сумма вклада

    int percen = scanner.nextInt();// процент


   int yar =scanner.nextInt();//сколько лет

    for (int i = 0; i < yar; i++){
        summa = summa + (summa * percen / 100 );
    }

        System.out.println(summa);


}}
