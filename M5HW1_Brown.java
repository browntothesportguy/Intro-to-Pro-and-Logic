import java.util.Scanner;
/**
 * M5HW1_
 */
public class M5HW1_Brown {

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
       int numberOfGrades;
       float totalSum = 0.0, average, counter = 1, currentGrade;
       string letterGrade, runAgain;

    do {
        System.out.println("Enter how many grades you like to average: ");
            numOfGrades = k.nextInt();
        if (numberOfGrades < 0) {
                System.out.println("Invalid value. Please enter a valid number between 0 and 100: ");
        }
    } while (numberOfGrades <= 0);

    while (counter <= numberOfGrades) {
        System.out.println("Enter grade #", count, ": ");
        curremtGrade = k.nextfloat();

        if (currentGrade >= 0 && currentGrade <= 100){
                totalSum = totalSum + currentGrade;
                counter = counter + 1;
        } else {
            System.out.println("Invalid grade score, Please enter a valid number between 0 and 100: ");
        }
        
    }

    Average = totalSum / numberOfGrades;
        
            if (average >= 90)
                {
                    grade = 'A';
                }
            else if (average >= 80)
                {
                    grade = 'B';
                }
            else if (average >= 70)
                {
                    grade = 'C';
                }
            else if (average >= 60)
                {
                    grade = 'D';
                }
            else
                {
                    grade = 'F';
                }
            
            System.out.println("Grade is " + grade);
    }
}
