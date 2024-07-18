class FoodPanda{
    static String foodName; 
	static String takeOrder;

	public static double takeOrder(String foodName){
		if(foodName == "Popeyes"){
			return 99.00;
		}
		if(foodName == "tan tock"){
			return 500.00;
		}
		if(foodName == "taste of india"){
			return 420.00;
		}
		if(foodName == "Daizu cafe"){
			return 230.00;
		}
		if(foodName == "Canadian Pizza"){
			return 99.00;
		}
		if(foodName == "Toast Box"){
			return 150.00;
		}
		if(foodName == "Chicken Popcorn"){
			return 145.00;
		}
		if(foodName == "Coffee Bean"){
			return 85.00;
		}
		if(foodName == "Tin City Corner coffee"){
			return 120.00;
		}
		if(foodName == "Marrybrown Aeon Big"){
			return 130.00;
		}
		if(foodName == "Nuggets"){
			return 60.00;
		}
		if(foodName == "Hooked Chicken"){
			return 80.00;
		}
		if(foodName == "Noah rolls"){
			return 56.00;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
			return 0.0;
			}
	}
	