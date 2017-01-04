
public class account {
protected int Accnumber;
protected double interestrate,amount;

 public double deposit(double damount){
	amount+=damount;
	return amount;
 }
 public double withdraw(double wamount){
	amount-=wamount;
	return amount;
 }
 
 public void interest(){
    amount=amount+amount*interestrate;
    System.out.println("interest"+amount);
 }
}