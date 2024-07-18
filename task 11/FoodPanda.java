class FoodPanda{
    

	public static double takeOrder(String foodName){
		if(foodName == "Popeyes") return 99.00;
		
		if(foodName == "tan tock") return 500.00;
		
		if(foodName == "taste of india") return 420.00;
		
		if(foodName == "Daizu cafe") return 230.00;
		
		if(foodName == "Canadian Pizza") return 99.00;
		
		else System.out.println(foodName + "Not Found");
		
			return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Popeyes")
		    {
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "tan tock") {
				price = 500.00 * quantity;
				return price; 
			}
			return price;
		}

}

		