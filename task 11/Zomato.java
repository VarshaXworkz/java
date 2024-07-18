class Zomato{
    
	public static double takeOrder(String foodName){
		if(foodName == "Maggie") return 90.00;
		
		if(foodName == "Aaloo Bonda") return 900.00;
		
		if(foodName == "Masala classic") return 40.00;
		
		if(foodName == "Samosa") return 290.00;
		
		if(foodName == "Aata maggie") return 98.00;
		
			return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Maggie")
			{
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "Aaloo Bonda") {
				price = 900.00 * quantity;
				return price; 
			}
			return price;
		}

}

		
		