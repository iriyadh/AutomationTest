import java.util.Scanner;

public class Switch2 {

    public static void main (String[] args){

        int expression = 2;

        Scanner reader = new Scanner (System.in);
        System.out.print ("Please enter your input: ");

        int num = reader.nextInt();
        String str= reader.nextLine();

        switch (expression){
            case 1:
                System.out.println("Case 1");

            case 2:
                System.out.println("Case 2");

            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");

        }
    }
}
