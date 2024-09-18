import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        This is the solution for Task 4
         */
        //print
        System.out.println();
        System.out.println("Task 4:");

        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] arr = new int[arr_size];

        //ask the user to enter the elements
        System.out.println("Enter the elements of the array: ");
        //add the elements
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        //assume the max is the first number
        int max = arr[0];
        //loop through the array
        for(int j=1; j< arr.length; j++ ){
            //check if the current number is bigger than the max
            //if yes, assign the new max>
            if(arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println("The max number is "+max);
    }
}