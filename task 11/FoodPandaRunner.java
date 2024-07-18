class FoodPandaRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = FoodPanda.takeOrder("Popeyes");
	System.out.println("The food price is "+foodPrice);
	
	double foodPrice1 = FoodPanda.takeOrder("tan tock");
	System.out.println("The food price is "+foodPrice1);
	
	double foodPriceWithQuantity = FoodPanda.takeOrder("Popeyes",4);
	System.out.println("The Popeyes price is "+foodPriceWithQuantity);
	    	
	}
}

