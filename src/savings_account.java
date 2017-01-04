import java.util.Scanner;

public class savings_account extends account {
savings_account(){
	System.out.println("Initial Balance:");
	Scanner bal = new Scanner(System.in);
	amount=bal.nextInt();
    super.interestrate=0.04;

 }
}