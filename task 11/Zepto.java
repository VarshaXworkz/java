class Zepto{

	public static double takeOrder(String foodName){
		if(foodName == "Potato") return 250.00;
		
		if(foodName == "apple")	return 650.00;
		
		if(foodName == "Onion") return 420.00;
		
		if(foodName == "Carrot") return 230.00;
		
		if(foodName == "Chilli")	return 99.00;
		
		if(foodName == "Chicken ")	return 150.00;
		
		else System.out.println(foodName + "Not Found");
		
			return 0.0;
	}
		public static double takeOrder(String foodName,int quantity){		
			double price=0.0;
			if(foodName == "Potato")
		    {
				price = 250.00 * quantity;
				return price; 
			}
			if(foodName == "apple") {
				price = 650.00 * quantity;
				return price; 
			}
			return price;
		}

}

		
		