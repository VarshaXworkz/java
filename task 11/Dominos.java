class Dominos{

    
	public static double takeOrder(String foodName){
		if(foodName == "Barbeque chicken pizza") return 99.00;
		
		if(foodName == "pacific veggie") return 500.00;
		
		if(foodName == "chilli chicken pizza")	return 420.00;
		
		if(foodName == "Margarita pizza") return 230.00;
		
		if(foodName == "Deluxe feast") return 99.00;
		
		else System.out.println(foodName + "Not Found");
		
			return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Barbeque chicken pizza")
		    {
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "pacific veggie") {
				price = 500.00 * quantity;
				return price; 
			}
			return price;
		}

}

		
		