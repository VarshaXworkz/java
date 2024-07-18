class Zepto{

    static String foodName; 
	static String takeOrder;
	public double takeOrder(String foodName){
				if(foodName == "Potato"){
			return 99.00;
		}
		else if(foodName == "apple"){
			return 500.00;
		}
		else if(foodName == "Onion"){
			return 420.00;
		}
		else if(foodName == "Carrot"){
			return 230.00;
		}
		else if(foodName == "Chilli"){
			return 99.00;
		}
		else if(foodName == "Chicken "){
			return 150.00;
		}
		else if(foodName == "Popcorn"){
			return 145.00;
		}
		else if(foodName == "Beans"){
			return 85.00;
		}
		else if(foodName == "Peas"){
			return 120.00;
		}
		else if(foodName == "Orange"){
			return 130.00;
		}
		else if(foodName == "Pineapple"){
			return 60.00;
		}
		else if(foodName == "Burger"){
			return 80.00;
		}
		else if(foodName == "Samosa"){
			return 56.00;
		}
		else if(foodName == "Aloo tikki"){
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
	
	