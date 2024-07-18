class ZomatoRunner{
	
	public static void main(String[] args){
		
	    double foodPrice1 = Zomato.takeOrder("Maggie");		
		System.out.println("the Maggie price is " +foodPrice1);
		double foodPrice2 = Zomato.takeOrder("Burger");		
		System.out.println("the Burger price is " +foodPrice2);
		double foodPrice3 = Zomato.takeOrder("Masala classic");		
		System.out.println("the Masala classic price is " +foodPrice3);
		double foodPrice4 = Zomato.takeOrder("Masala classic");		
		System.out.println("the Masala classic price is " +foodPrice4);
		double foodPrice5 = Zomato.takeOrder("Samosa");		
		System.out.println("the Samosa price is " +foodPrice5);
		double foodPrice6 = Zomato.takeOrder("Aata maggie");		
		System.out.println("the Aata maggie price is " +foodPrice6);
		double foodPrice7 = Zomato.takeOrder("Biryani");		
		System.out.println("the Biryani price is " +foodPrice7);
		double foodPrice8 = Zomato.takeOrder("Chilli potato");		
		System.out.println("the Chilli potato price is " +foodPrice8);
		double foodPrice9 = Zomato.takeOrder("veg noodles");		
		System.out.println("the veg noodles price is " +foodPrice9);
		double foodPrice10 = Zomato.takeOrder("veg thali");		
		System.out.println("the veg thali price is " +foodPrice10);
		double foodPrice11 = Zomato.takeOrder("");		
		System.out.println("the  price is " +foodPrice11);
		double foodPrice12 = Zomato.takeOrder("veg thali");		
		System.out.println("the veg thali price is " +foodPrice12);
		double foodPrice13 = Zomato.takeOrder("Chilli potato");		
		System.out.println("the Chilli potato price is " +foodPrice13);
		double foodPrice14 = Zomato.takeOrder("veg thali");		
		System.out.println("the veg thali price is " +foodPrice14);
		double foodPrice15 = Zomato.takeOrder("Chilli potato");		
		System.out.println("the Chilli potato price is " +foodPrice15);

	}
}	