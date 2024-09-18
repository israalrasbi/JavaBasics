//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        This is the solution for Task 2
         */
        System.out.println("Task 2:");
        //create a scanner object to take the input from the user
        Scanner sc = new Scanner(System.in);
        //take input from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        //print the multiplication table based on the user input
        System.out.println("The multiplication table of " + number);
        for(int i=1 ;i<=10; i++){
            System.out.println(number*i);
        }
        }
    }
