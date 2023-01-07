import java.util.Scanner;

public class OddEven {
       public static void main (String []arg)
       {
           Scanner reader = new Scanner (System.in);
           System.out.print ("Please enter your input: ");

           int num = reader.nextInt();
        if (num %2 == 0){
            System.out.println ("This is an even number");}
        else
            System.out.println ("This is a odd number");

    }

    }

