package Homwork5_10_11_22;
import java.util.Scanner;

public class Homwork10_11_22 {

    public static void main(String[] args) {

        //First level: Найдите следующее четное число.
        //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94.
        //Решить задачу с помощью if
        //
        //Second level: Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить,
        // где сейчас находится Джон: ближе к нему или к Мэри.
        //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
        // Также он знает, сколько километров длится полная дорога от него к  Мэри.
        //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
        //Вывести на экран имя персонажа, к которому сейчас ближе Джон

        //    что нужно сделать :
        // Прописать все данные которые известны - длинна полного пути,
        // время и скорость, время и скорость умножить,
        // и потом прописать if-ом если больше половины
        // проехал то ближе к Мери else к Шерлоку  Длинна пути / 2

        // Там просто надо было прописать, если делиться на 2 без
        // остатка тогда +2, если нет +1


        Scanner scanner = new Scanner(System.in);

       // number / =2;
        //numer ++;
        //number   *=2;
       // System.out.println(number);


      //  int number = scanner.nextInt();  // 42(21 -е четное число -> 44 (22 - e)
        // 38 (19 - е) ->40 (20-e)
        // 1230 (615- е)-> 1232 (616)
    //   if ( number % 2 ==0){
      //      System.out.println( number + 2);
      //  }
      //  else {
       //     System.out.println(number +1);
   //     }



        //int a = 0;
        //  while (a < 1000) {
        //    a++;
        //   if (a % 2 == 0)
        //        System.out.println(a);

        //}
        int speed = scanner.nextInt();// скорость
        int time = scanner.nextInt();//время
        int path = scanner.nextInt();//расстояние

          int firstPath = time * speed; //сколько проехал поезд
          int secondPath = path - firstPath; // длина второго отрезка пути (до Мери)

        if ( firstPath > secondPath  ) {

            System.out.println("Шерлок ");
        }

        if (firstPath > secondPath ){
            System.out.println( "Джон");
        }

        if ( firstPath == secondPath){
            System.out.println( "Одинаково");
        }
    }

}


