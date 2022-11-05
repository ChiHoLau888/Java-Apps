package Week3;
import helpers.*;

public class Week03 
{
    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
    
        do7TimesTable();
    }

    private static void do7TimesTable() 
    {
        int product;

        for(int value = 1; value <= 12; value++ )
        {
            product = value * 7;
            System.out.println("Product = " + product);
        }
    }     
}