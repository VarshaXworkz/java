class BankAccount1 {

	static double balance = 50000;	
	//here debit is functionality for bank
			public static void debit(double amount){
			System.out.println("Debit started");
			if(amount<=balance)
				balance=balance-amount;
			else
				System.out.println("Insufficient balance");	
			
			System.out.println("Debit ended");
			return;			
			}
		public static void credit(double amount){
		System.out.println("Credit started");
		if(amount>0){
			balance=balance+amount;
		}else{	
		System.out.println("Amount cant be zero");
		}
		
			public static double getBalance(){
				System.out.println("Fetching Balance....");
			return balance;
		}
}
}