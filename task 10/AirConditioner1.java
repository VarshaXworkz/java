class AirConditioner1 {
	
	   static boolean isConnected;        
                 // variable      
	   static int     currentTemperature  ; 
	   static  int    minTemperature  ; 
        static int maxTemperature  = 6 ; 
		
		
		
       public static boolean onOrOff(){
		   	 System.out.println("onOrOff started");
			 // false == false
		    isConnected=(isConnected==false)? true : false;
			 System.out.println("onOrOff ended");
			
			return isConnected;
			}
			
		
          System.out.println("onOrOff ended");
        return ;		
	   }
	  
	  
	   public static void increaseTemperature(){
				 System.out.println("increaseTemperature() started");
			if(isConnected == true){	       
				 if(currentTemperature <= maxTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("Max Temperature Reached");
					 } 
			}else{
				System.out.println("Please AC on maadu");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
	   
	   /* public static void decreaseTemperature(){
		   // logic
	   }*/
	       
   
        
		 // method Declaration
		public static  void  getFeatures(){
			 System.out.println("getFeatures() started");
		 // local variable
		       String  name= "Samsung";
		  double  price = 7000.00 ; 
		  System.out.println("The Brand Name is "+ name);
		 System.out.println("The Brand Price is "+ price);
		 
			 System.out.println("getFeatures() ended");
		  return ;
		 }
  

}