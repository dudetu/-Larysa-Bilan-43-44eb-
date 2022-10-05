package Lessen1;

public class homwork1 {
    //09/27 boolean вычисления и long

    public static void main(String[] args) {

    long secund = 3011456_567l;
    long minut = 60 ;
    minut = secund / minut;
    long chas = 60 ;
    chas = minut / chas ;

    long  day =  24;
    day = chas / day ;

    long  year = 360;
    year = day / year;

             long secundyear = (60*60*24*360);

        System.out.println(  minut  +    "сколько минут прожито ");
        System.out.println( chas  +   " ссколько часов прожито" );
        System.out.println(  day   +   " сколько дней прожито ");
                System.out.println( year  +   " сколько лет прожито ");
        System.out.println(secund / secundyear); System.out.println(" или сколько лет прожито ");

    int time = 4 ;
    boolean rigt = time > 5 ;
    boolean  name = false ;
    boolean  asterix = true ;
    boolean   answer = rigt || asterix ;


        System.out.println(answer );


}
}
