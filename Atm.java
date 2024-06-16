//1.Create a class to represent the ATM machine.

//2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//checking the balance.

//3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//checkBalance().

//4. Create a class to represent the user's bank account, which stores the account balance.

//5. Connect the ATM class with the user's bank account class to access and modify the account
//balance.

//6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

//7. Display appropriate messages to the user based on their chosen options and the success or failure
//of their transactions.
import java.util.*;

class BankAccount 
{
    int bankBalance=5000;
    int getBalance()
    {
        return bankBalance;
    }
    boolean withdraw(int amount)
    {
        if(bankBalance-amount>=1000)
        {
            bankBalance=bankBalance-amount;
            return true;
        }
        return false;
    }

    void diposit(int amount)
    {
        bankBalance=bankBalance+amount;
    }
}
class Atm_Machine extends BankAccount
{
    Scanner r;
    Atm_Machine(Scanner r)
    {
        this.r=r;
    }
    void withdraw()
    {
        System.out.println("enter the amount to wihtdraw  ");
        int amount=r.nextInt();
        if(withdraw(amount))
        {
            System.out.println("the amount withdrawn is  "+amount);
           
            System.out.println("BankBalance is "+getBalance());
            System.out.println("transation is successful");
        }
        else{
            System.out.println("insuffecent balance for withdraw ");
            System.out.println("transation is failed ");
        }
        
        
    }
    void diposit()
    {
        System.out.println("enter the amount to deposit  ");
        int amount=r.nextInt();
        diposit(amount);
        System.out.println("The deposited amount is "+amount);
       
        System.out.println("BankBalance is "+getBalance());
    }

    void checkBalance()
    {
        System.out.println("BankBalance is "+getBalance());
    }
}

public class Atm{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int ch;
        int amount=0;
        Atm_Machine result = new Atm_Machine(r);
       
        boolean flag=true;
        while(flag)
        {
            System.out.println("enter the option what you want to do 1.withdraw(amount) 2.deposit(amount), and 3.checkBalance()");
            ch=r.nextInt();
            switch (ch) {
                    case 1:result.withdraw();
                            break;
                    case 2:result.diposit();
                            break;
                    case 3:result.checkBalance();
                            break;
                
                    default:
                    flag=false;
                        break;
            }
        }




    }
}



