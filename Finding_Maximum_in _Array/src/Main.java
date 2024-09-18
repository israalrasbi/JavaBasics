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
        int[] arr = {2,3,6,4,1,9,0};
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