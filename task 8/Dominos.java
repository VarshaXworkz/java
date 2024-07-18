class Dominos{

    static String foodName; 
	static String takeOrder;
	public double takeOrder(String foodName){
		if(foodName == "Barbeque chicken pizza"){
			return 99.00;
		}
		else if(foodName == "pacific veggie"){
			return 500.00;
		}
		else if(foodName == "chilli chicken pizza"){
			return 420.00;
		}
		else if(foodName == "Margarita pizza"){
			return 230.00;
		}
		else if(foodName == "Deluxe feast"){
			return 99.00;
		}
		else if(foodName == "spanish feast"){
			return 150.00;
		}
		else if(foodName == "pacific veggie"){
			return 145.00;
		}
		else if(foodName == "buttalo chicken"){
			return 85.00;
		}
		else if(foodName == "Chicken tandoori"){
			return 120.00;
		}
		else if(foodName == "Chicken nachos"){
			return 130.00;
		}
		else if(foodName == "philly cheese stack"){
			return 60.00;
		}
		else if(foodName == "bacon cheeseburst"){
			return 80.00;
		}
		else if(foodName == "Burger mini"){
			return 56.00;
		}
		else if(foodName == "Burger Blast"){
			return 59.00;
		}
		else if(foodName == "memphia"){
			return 90.00;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
			return 0.0;
			}
	}
	