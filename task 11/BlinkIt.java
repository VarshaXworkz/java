class BlinkIt{

    
	public static double takeOrder(String foodName){
		if(foodName == "Bread")	return 99.00;
		
		if(foodName == "onion")	return 500.00;
		
		if(foodName == "potato") return 420.00;
		
		if(foodName == "radish") return 230.00;
		
		if(foodName == "mango")	return 99.00;
		
		else System.out.println(foodName + "Not Found");
		
			return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Bread")
		    {
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "onion") {
				price = 500.00 * quantity;
				return price; 
			}
			return price;
		}

}

		
		