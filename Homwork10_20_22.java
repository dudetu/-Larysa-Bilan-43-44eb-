package Homwork10_20_22;

import java.util.Scanner;

public class Homwork10_20_22 {

    private static int i;

    public static void main(String[] args) {

        //  First level: Level1 (решается через for)
        // Вводится n. Найдите сумму такого выражения:
        // 1+1/2+1/3+1/4…..+1/n


        // Level2 (решается через while)
        // Вводится число (число может быть и маленьким и большим),
        // но вмешается в int. Найти сумму всех цифр этого числа


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <=n; i += 1.0 / n) {

            System.out.println( ( 1.0 /n)+(1.0/n)  );

        }

        int a = scanner.nextInt();
        int number ;
        int m ;
          int summa ;

        while (a != 0) {
            number = a % 10;
            m = a / 10;
            summa = m+number;
               summa =summa+summa;

            System.out.println(summa);
        }

    }
    }

