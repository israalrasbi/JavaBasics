//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        This is the solution for Task 5
         */
        System.out.println();
        System.out.println("Task 5:");
        String str = "the cat in the hat";
        int count = 0; //create a variable to count the number of vowels
        //convert the string into char, then loop through the char
        for (char c: str.toCharArray()) {
            //check for each vowel, if there is a match then increment the count
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }}
        System.out.println("The count of vowels is "+count);
    }
}