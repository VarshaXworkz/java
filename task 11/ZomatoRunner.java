class ZomatoRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Zomato.takeOrder("Maggie");
	System.out.println("The food price is "+foodPrice);
	
	double foodPrice1 = Zomato.takeOrder("Aaloo Bonda");
	System.out.println("The food price is "+foodPrice1);
	
	double foodPriceWithQuantity = Zomato.takeOrder("Aaloo Bonda",4);
	System.out.println("The Aaloo Bonda price is "+foodPriceWithQuantity);
	    	
	}
}



