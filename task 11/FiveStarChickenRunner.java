class FiveStarChickenRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = FiveStarChicken.takeOrder("Pesto");
	System.out.println("The food price is"+foodPrice);
	
	double foodPrice1 = FiveStarChicken.takeOrder("Burger");
	System.out.println("The food price is"+foodPrice1);
	
	double foodPriceWithQuantity = FiveStarChicken.takeOrder("Burger",4);
	System.out.println("The Burger price is"+foodPriceWithQuantity);
	    	
	}
}



