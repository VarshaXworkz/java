class FiveStarChicken{

    static String foodName; 
	static String takeOrder;
	public double takeOrder(String foodName){
		if(foodName == "Pesto"){
			return 99.00;
		}
		else if(foodName == "Burger"){
			return 500.00;
		}
		else if(foodName == "Crucnchy Masala"){
			return 420.00;
		}
		else if(foodName == "Thai Crispy"){
			return 230.00;
		}
		else if(foodName == "Southern Spice"){
			return 99.00;
		}
		else if(foodName == "Chicken shots"){
			return 150.00;
		}
		else if(foodName == "Chicken Popcorn"){
			return 145.00;
		}
		else if(foodName == "Fries"){
			return 85.00;
		}
		else if(foodName == "Chicken sticks"){
			return 120.00;
		}
		else if(foodName == "Chicken nachos"){
			return 130.00;
		}
		else if(foodName == "Nuggets"){
			return 60.00;
		}
		else if(foodName == "Burger big"){
			return 80.00;
		}
		else if(foodName == "Burger mini"){
			return 56.00;
		}
		else if(foodName == "Burger Blast"){
			return 59.00;
		}
		else if(foodName == "Strips"){
			return 90.00;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
			return 0.0;
			}
	}
	