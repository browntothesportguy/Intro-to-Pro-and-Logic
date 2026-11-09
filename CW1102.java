/** 
 * CW1102 
 */
import java.util.Scanner;
public class CW1102 
{
    public static void main(String[] args) 
    {
        System.out.println("Methods");
        System.out.println();
        // create variables to hold fname, mname andlname
        String fname = "Isiah", mname = "Rahson", lname = "Brown";
        // create a scanner variable
        Scanner sc = new Scanner(System.in);
        // call printFname() to print first name
        printFname(fname, sc);
        // call middle name method
        printMname(mname);
        // call last name method
        printLname(lname);
    }
    // create a method to display my first name
    public static void printFname(String fname, Scanner sc)
    {
        System.out.println(fname);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);
    }
    public static void printMname(String mname)
    {
        System.out.println(mname);
    }
    public static void printLname(String lname)
    {
        System.out.println(lname);
    }
}

