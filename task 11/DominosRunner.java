class DominosRunner{
	
	public static void main(String[] foo){
		
	double foodPrice = Dominos.takeOrder("Barbeque chicken pizza");
	System.out.println("The food price is "+foodPrice);
	
	double foodPrice1 = Dominos.takeOrder("pacific veggie");
	System.out.println("The food price is "+foodPrice1);
	
	double foodPriceWithQuantity = Dominos.takeOrder("Barbeque chicken pizza",4);
	System.out.println("The Bread price is "+foodPriceWithQuantity);
	    	
	}
}

