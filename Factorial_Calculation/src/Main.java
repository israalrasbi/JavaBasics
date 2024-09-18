//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        This is the solution for Task 3
         */
        System.out.println();
        System.out.println("Task 3:");
        //take the user input
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number2 = sc.nextInt();
        //define variables
        int i = 1; //this is the counter
        int factorial = 1; //this is to save the result of the factorial
        while(i<=number2){
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + number2+" is "+factorial);
        }
    }
