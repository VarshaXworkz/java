class Swiggy2{
		
		static String takeOrder;
		public static double takeOrder(String foodName){
		System.out.println("get order started");
		if (foodName =="Pizza"){
			return 99.00;
		}
		if(foodName=="Burger"){
			return 120.00;
		}
		if(foodName=="Chocolate Ice Cream"){
			return 80.00;
		}
		if(foodName=="Biryani"){
			return 250.00;
		}
		if(foodName=="Grill Chicken"){
		return 360.00;
		}
		if(foodName=="Dairy Milk"){
		return 200.00;
		}
		if(foodName=="Momos"){
		return 160.00;
		}
		if(foodName=="Chicken Popcorn"){
		return 360.00;
		}
		if(foodName=="Potato Chips"){
		return 60.00;
		}
		if(foodName=="French Fries"){
		return 90.00;
		}
		if(foodName=="Gobi Manchurian"){
		return 120.00;
		}
		if(foodName=="Paneer Manchurian"){
		return 140.00;
		}
		if(foodName=="Veg fried Rice"){
		return 100.00;
		}
		if(foodName=="Curd Rice"){
		return 260.00;
		}
		if(foodName=="Non-veg Combo"){
		return 560.00;
		}else{
			System.out.println(foodName + " Not Found");
		}
		System.out.println("get order ended");
		 return 0.0;
	}
	
}