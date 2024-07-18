class Swiggy1Runner {
   
   public static void main(String[] args) {
        
        System.out.println("Please enter your order");
        

        Swiggy swiggy = new Swiggy();
        double price = swiggy.takeOrder();

        if (price != 0.0) {
            System.out.println("Your order confirmed, price: $" + price);
        } else {
            System.out.println("Please select a valid item from the menu.");
        }

        return; // Close the scanner to prevent resource leak
    }
}