//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadz dowolną liczbę:");
        double x=scanner.nextDouble();

        if(x<0){
            System.out.println("Liczba mniejsza od zera");
        }
        else if (x==0) {
            System.out.println("Liczba rowna zero");
        }
        else if (x>0) {
            System.out.println("Liczba wieksza od zera");
        }


    }
}