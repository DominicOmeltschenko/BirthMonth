import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //class monthAsker
    //  main()
    //      num birthMonth
    //      output "Please enter your birth month [1-12]"
    //      input birthMonth
    //  if birthMonth >= 1 and birthMonth <= 12  then
    //      output “Your birth month is:” + birthMonth
    //  else
    // 		output “Error, you entered an invalid month. You entered:” + birthMonth
    //  end if
    //  return
    //end class
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month: ");

        int birthMonth = 0;
        String trash = "";

        if (in.hasNextInt())
        {

            birthMonth = in.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("Error, you entered an invalid month. You entered: " + birthMonth);
                System.out.println("Run the program again and enter a valid month!");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid month!");
        }        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}