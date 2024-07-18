class MicrowaveOven {
	
	   static boolean isConnected;        
                 // variable      
	   static int     currentTemperature  ; 
	   static  int    minTemperature  ; 
        static int maxTemperature  = 107 ; 
		
		
       public static void onOrOff(){
		   	 System.out.println("onOrOff started");
			 // false == false
		    if(isConnected == false){
			 isConnected =true ; 
		  System.out.println("MicrowaveOven Turned on");
			} else  if(isConnected == true){
				   isConnected = false ;
			 System.out.println("MicrowaveOven Turned Off");
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
				System.out.println("Please Oven on maadu");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
	   
	   

}