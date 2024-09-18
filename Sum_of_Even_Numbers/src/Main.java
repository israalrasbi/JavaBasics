//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         /*
          This is the solution for Task 1
         */
        int sum = 0;
        for(int i=0; i<=50; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Task 1:");
        System.out.println("The sum of even numbers: "+sum);
        System.out.println();
    }
}