//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        import java.util.Scanner;
        import java.io.*;
        class InputScanner
        {
            public static void main(String[] args)
            {
// Declarations of variables
                Scanner scant = new Scanner(System.in);
                int integer_type;
                long long_type
                float real_type;
                double double_type;
                String string2;
// Prompts the User
                System.out.println("Enter three numbers integer,long and float ");
                System.out.println("Enter number, another floating-point number, " + "and a string.");
                System.out.println("Separate each input with  blank or return.");
// Read in values
                integer_type = scant.nextInt();
                long_type = scant.nextLong();//taking long type input
                real_type = scant.nextFloat();//taking float type input
                double_type = scant.nextDouble();//taking double type input
                System.out.println("enter one more value.");
                string2 = scant.next(); // string input
                System.out.println("Here is the output Created: ");
                System.out.println(integer_type + " " + long_type + " " + real_type + " " + double_type + " " + string2);
            }
        }
        
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}