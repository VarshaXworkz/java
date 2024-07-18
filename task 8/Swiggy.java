class Swiggy{
    static String foodName; 
	static String takeOrder;
	
	
	//method declaration
	public static double takeOrder(String foodName){
		if(foodName == "Pizza"){
			return 99.00;
		}
		if(foodName == "Burger"){
			return 120.00;
		}
		if(foodName == "momos"){
			return 60.00;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
			return 0.0;
			}
	}
	