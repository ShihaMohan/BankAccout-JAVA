import java.util.Scanner;

public class main_account {



	private static Scanner acc;

	public static void main(String[] args) {
      int choice1, choice2;
      double transamount,currentbalance=0;
      account transact;
      acc = new Scanner(System.in);
      System.out.println("Enter the Account Number:");
      int accountnumber = acc.nextInt();
      System.out.println("1.current_account \n 2.savings_account \n 3.fixed_acount");
	  System.out.println("Enter the account type:");
	  choice1=acc.nextInt();
	  
	  switch(choice1){
	  case 1:  transact= new current_account();
	           transact.interest();
	           break;
	          
	  case 2:  transact= new savings_account();
	           transact.interest();
	           break;
	          
	  case 3:  transact= new fixed_account();
	           transact.interest();
	           break;
	  
	  default: transact=new account();
	           System.out.println("Not Valid selection");
	           break;
	  
	  }
	  
	  System.out.println("Enter the choice 1.Deposit 2.Withdraw :");
	  choice2= acc.nextInt();
	  
	  switch(choice2){
	  case 1:  System.out.println("Deposited Amount:");
	           transamount= acc.nextDouble();
	           currentbalance=transact.deposit(transamount);
	           break;
	           
	   case 2:  System.out.println("Withdraw Amount:");
	            transamount= acc.nextDouble();
	            currentbalance=transact.withdraw(transamount);
	            break;
	            
	   default: System.out.println("Wrong choice");
	            break;
	  }
	  
      System.out.println("Current Balance"+currentbalance);
     
	}

}
