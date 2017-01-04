import java.util.Scanner;

public class fixed_account extends account {
 fixed_account(){
	System.out.println("Initial Balance:");
	Scanner bal = new Scanner(System.in);
	amount=bal.nextInt();
	super.interestrate=0.08;
 }

public double deposit(double damount){
   System.out.println("Not possible to Deposit");
   return amount;
 }

public double withdraw(double wamount){
   System.out.println("Not possible to Withdraw");
   return amount;
 }
}
