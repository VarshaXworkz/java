class Swiggy1 {
    static String foodName; 

    public double takeOrder(String foodName) {
        		if(foodName == "Tomato Soup"){
			return 99.00;
		}
		else if(foodName == "Sweet corn soup"){
			return 500.00;
		}
		else if(foodName == "Chicken kurma"){
			return 420.00;
		}
		else if(foodName == "chicken roll"){
			return 230.00;
		}
		else if(foodName == "Pepper soup"){
			return 99.00;
		}
		else if(foodName == "Manchurian"){
			return 150.00;
		}
		else if(foodName == "Omlette"){
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
		else if(foodName == "Dragon chicken"){
			return 60.00;
		}
		else if(foodName == "tom yum soup"){
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
	