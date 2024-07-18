class Swiggy2Runner{
	
	public static void main(String[] foo){
	
	System.out.println("main method started");
	    
		System.out.println("Price of Pizza: " + Swiggy.takeOrder("Pizza"));
        System.out.println("Price of Burger: " + Swiggy.takeOrder("Burger"));
        System.out.println("Price of Pasta: " + Swiggy.takeOrder("Pasta"));
		System.out.println("Price of Chocolate Ice Cream: " + Swiggy.takeOrder("Chocolate Ice Cream"));
		System.out.println("Price of Gobi Manchurian: " + Swiggy.takeOrder("Gobi Manchurian"));
		System.out.println("Price of Veg fried Rice: " + Swiggy.takeOrder("Veg fried Rice"));
		System.out.println("Price of Curd Rice: " + Swiggy.takeOrder("Curd Rice"));
		System.out.println("Price of Non-veg Combo: " + Swiggy.takeOrder("Non-veg Combo"));
		System.out.println("Price of Chicken Popcorn: " + Swiggy.takeOrder("Chicken Popcorn"));
		System.out.println("Price of Potato Chips: " + Swiggy.takeOrder("Potato Chips"));
		

		
	System.out.println("main method ended");

		
	}
}