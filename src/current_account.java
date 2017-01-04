import java.util.Scanner;


public class current_account extends account {
current_account(){
	System.out.println("Initial Balance:");
	Scanner bal = new Scanner(System.in);
	amount=bal.nextInt();
	super.interestrate=0.00;
 }
}
