class BillId {
	
	static int billId = 101;
	static String billIssueDate = "12/06//2024";
	static String billDueDate = "26/06/2024";
	static boolean isBillPaid = false ;
	static boolean isLatestBill = true ;



     public static void main( String jioBill[]) {

	
	System.out.println("------------------------------");
	System.out.println("The Bill Id is : "+ billId);
	System.out.println("The Bill is Issued On :" + billIssueDate);
	System.out.println("The Bill Due Date is :" + billDueDate);
  	System.out.println(isLatestBill);
	System.out.println(isBillPaid);
	System.out.println("------------------------------");

	
   }

}