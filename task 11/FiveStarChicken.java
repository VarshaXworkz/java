class FiveStarChicken{

    
	public static double takeOrder(String foodName){
		if(foodName == "Pesto") return 99.00;

		if(foodName == "Burger")return 500.00;

		if(foodName == "Crucnchy Masala") return 420.00;
		
		else System.out.println(foodName+ "Not found");
		
		return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Pesto")
			{
				price = 99.00 * quantity;
				return price; 
			}
			if(foodName == "Burger") {
				price = 500.00 * quantity;
				return price; 
			}
			return price;
		}

}
