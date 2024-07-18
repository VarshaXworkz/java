class BlinkItRunner{
	
	public static void main(String[] args){
		System.out.println("Please enter your order");
		String foodName=scanner.nextLine();
	    double price = Swiggy.takeOrder(foodName);		
		System.out.println("Your order confirmed" +price);
	}
}	