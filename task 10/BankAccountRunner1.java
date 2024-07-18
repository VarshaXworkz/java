class BankAccountRunner1 {
		
		public static void main(String[] axisBank){
		BankAccount.getBalance();
		System.out.println("main started");
		BankAccount.debit(400.00);
		double ref=BankAccount.getBalance();
		System.out.println(ref);
		BankAccount.debit(1000.00);
		 ref=BankAccount.getBalance();
		System.out.println(ref);
		BankAccount.debit(500.00);
		 ref=BankAccount.getBalance();
		System.out.println(ref);
		BankAccount.credit(1000.00);
		 ref=BankAccount.getBalance();
		System.out.println(ref);
		BankAccount.credit(2000.00);
		 ref=BankAccount.getBalance();
		System.out.println(ref);
		BankAccount.credit(3000.00);
		 ref=BankAccount.getBalance();
		System.out.println(ref);
		
		}
}