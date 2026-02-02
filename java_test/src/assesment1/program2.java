package assesment1;

public class program2 {
	private double balance;
	public void deposit(double money) {
		balance = balance+money;
		System.out.println("deposit:"+money);
	
}
		public void withdraw(double money) {
			if(money <=balance) {
				balance = balance-money;
				System.out.println("withdrawal money"+money);
			}
			else {
				System.out.println("");
			}
		}
		
		class savingsaccount extends balance {
			
		}
		class currentsaccount extends balance{
			
		}
		class bank{
			public static void main(String args[]) {
				
				
			}
				
			}
		}

