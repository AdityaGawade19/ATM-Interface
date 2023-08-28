import java.util.Scanner;

public class Task3 
{    
    public static void main(String args[] )  
    {   
        int balance = 10000, withdraw, deposit;   
        Scanner sc = new Scanner (System.in);  
          
        while(true)  
        {    
            System.out.println("Welcome, Automated Teller Machine(ATM)");  
            System.out.println("(1) Withdraw");  
            System.out.println("(2) Deposit");  
            System.out.println("(3) Check Balance");  
            System.out.println("(4) EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                       
        withdraw = sc.nextInt();  
                       
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw; 
            System.out.println('\n' + "Withdrawing.............."); 
            System.out.println("Please collect your Amount Rs." + withdraw);  
        }  
        else  
        {    
            System.out.println('\n' + "Failure! Insufficient Funds!");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        deposit = sc.nextInt();  
                       
        balance = balance + deposit;  
        System.out.println("Your Money has been Deposited Successfully");  
        System.out.println("");  
        break;  
   
                case 3:    
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:   
        System.exit(0);  
            }  
        }  
    }  
}  

