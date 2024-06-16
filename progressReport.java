
import java.util.*;
class Calculation
{
    int arr[];
    Calculation(int arr[])
    {
        this.arr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            this.arr[i]=arr[i];
        }
    }
    int totalMarks()  //Calculate Total Marks: Sum up the marks obtained in all subjects.
    {
        int total=0;
        for(int i=0;i<this.arr.length;i++)
        {
            total=total+this.arr[i];
        }
        return total;

    }

    double averagePercentage()  //Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
    {
        int percentage=0;
        percentage=((totalMarks())/this.arr.length);
        return percentage;
    }

    void displayResult()  //Display Results: Show the total marks, average percentage, and the corresponding grade to the userpublic
    {
        System.out.println("total marks obtained is "+totalMarks());
        System.out.println("averagePercentage obtained is "+averagePercentage());
        double percentage=averagePercentage();
        if(percentage>=90)
        {
            System.out.println("obtained grade is  "+"O");
        }
        else if(percentage>=80)
        {
            System.out.println("obtained grade is  "+"A+");
        }
        else if(percentage>=70)
        {
            System.out.println("obtained grade is  "+"A");
        }
        else if(percentage>=60)
        {
            System.out.println("obtained grade is  "+"B+");
        }
        else if(percentage>=50)
        {
            System.out.println("obtained grade is  "+'B');
        }
        else if(percentage>=40)
        {
            System.out.println("obtained grade is  "+'C');
        } 
        else if(percentage>=35)
        {
            System.out.println("obtained grade is  "+'D');
        }
        else{
            System.out.println("obtained grade is "+'F');
        }

    }

}
public class progressReport
{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);

        //Input: Take marks obtained (out of 100) in each subject.
        System.out.println("enter the total number of subjects");
        int n=r.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=r.nextInt();
        }

       Calculation result = new Calculation(arr);
        result.displayResult();
    }
}