class ZeptoRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Zepto.takeOrder("Potato");
	System.out.println("The food price is "+foodPrice);
	
	double foodPrice1 = Zepto.takeOrder("apple");
	System.out.println("The food price is "+foodPrice1);
	
	double foodPriceWithQuantity = Zepto.takeOrder("Potato",4);
	System.out.println("The Potato price is "+foodPriceWithQuantity);
	    	
	}
}