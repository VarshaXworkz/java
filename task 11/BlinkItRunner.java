class BlinkItRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = BlinkIt.takeOrder("Bread");
	System.out.println("The food price is "+foodPrice);
	
	double foodPrice1 = BlinkIt.takeOrder("onion");
	System.out.println("The food price is "+foodPrice1);
	
	double foodPriceWithQuantity = BlinkIt.takeOrder("Bread",4);
	System.out.println("The Bread price is "+foodPriceWithQuantity);
	    	
	}
}

