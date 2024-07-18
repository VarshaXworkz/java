class BankAccount {

	static double balance = 50000;	
	//here debit is functionality for bank
			public static void debit(double amount){
			System.out.println("Debit started");
				balance=balance-amount;
			System.out.println("Debit ended");	
			}
		public static void credit(double amount){
		System.out.println("Credit started");
			balance=balance+amount;
		System.out.println("Credit ended");
		}
		public static double getBalance(){
		System.out.println("Fetching Balance....");
			return balance;
		}
}