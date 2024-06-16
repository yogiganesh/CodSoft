import java.util.*;

public class Taskone
{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        //1.Generating a random number within a specified range, such as 1 to 100.
        int minValue=1,maxValue=100,totalRounds=0,roundsWon=0;
       
        boolean flag=true;
        
        int randomNumber = (int)(Math.random() * ((maxValue - minValue) + 1)) + minValue;
        //System.out.println(randomNumber);

       
        while(flag==true )  // Repeat steps 2 and 3 until the user guesses the correct number.
        {

           
            int totalAttempts=10;  // Limit the number of attempts the user has to guess the number.
            totalRounds++;

           

            while(totalAttempts!=0)
            {
                    

                    //2.Prompt the user to enter their guess for the generated number.
                    System.out.println("enter the guess for the generated number ");
                    int guessedNumber=r.nextInt();
                    //3. Compare the user's guess with the generated number and provide feedback on whether the guessis correct, too high, or too low.
                    if(guessedNumber==randomNumber)
                    {
                        System.out.println("your guessis correct");
                        roundsWon++;
                        break;

                    }
                    else if(guessedNumber>randomNumber)
                    {
                        System.out.println("your guessis too high");
                    }
                    else
                    {
                        System.out.println("your guessis too low");
                    }
                    totalAttempts--;

            }
            System.out.println("Do you want to play another game print 1.yes  2.no"); // Add the option for multiple rounds, allowing the user to play again.
            int ch=r.nextInt();
            if(ch==2)
                flag=false;


        }
        //Display the user's score, which can be based on the number of attempts taken or rounds won.
        System.out.println("The user's score, which based on rounds won  "+(roundsWon/totalRounds));

       
    }

}