class Zomato{
    static String foodName; 
	static String takeOrder;
	public static double takeOrder(String foodName){
		if(foodName == "Maggie"){
			return 90.00;
		}
		else if(foodName == "Burger"){
			return 900.00;
		}
		else if(foodName == "Masala classic"){
			return 40.00;
		}
		else if(foodName == "Samosa"){
			return 290.00;
		}
		else if(foodName == "Aata maggie"){
			return 98.00;
		}
		else if(foodName == "Biryani"){
			return 190.00;
		}
		else if(foodName == "Chilli potato"){
			return 165.00;
		}
		else if(foodName == "veg noodles"){
			return 85.00;
		}
		else if(foodName == "veg thali"){
			return 70.00;
		}
		else if(foodName == "non-veg thali"){
			return 130.00;
		}
		else if(foodName == "Aloo paratha"){
			return 60.00;
		}
		else if(foodName == "roti"){
			return 80.00;
		}
		else if(foodName == "onion pakoda"){
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
	