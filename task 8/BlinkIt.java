class BlinkIt{

    static String foodName; 
	static String takeOrder;
	public double takeOrder(String foodName){
				if(foodName == "Bread"){
			return 99.00;
		}
		else if(foodName == "onion"){
			return 500.00;
		}
		else if(foodName == "potato"){
			return 420.00;
		}
		else if(foodName == "radish"){
			return 230.00;
		}
		else if(foodName == "mango"){
			return 99.00;
		}
		else if(foodName == "tea gold"){
			return 150.00;
		}
		else if(foodName == "Colin"){
			return 145.00;
		}
		else if(foodName == "chocolate"){
			return 85.00;
		}
		else if(foodName == "sweet corn"){
			return 120.00;
		}
		else if(foodName == "iPhone"){
			return 130.00;
		}
		else if(foodName == "LED Rope"){
			return 60.00;
		}
		else if(foodName == "Pendrive"){
			return 80.00;
		}
		else if(foodName == "Burger mini"){
			return 56.00;
		}
		else if(foodName == "Dettol"){
			return 59.00;
		}
		else if(foodName == "Gum"){
			return 90.00;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
			return 0.0;
			}
	}
	
	