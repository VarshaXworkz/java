class Television{
static boolean isOn = false;
       static int  currentVolume  ; 
	   static  int    minVolume  ; 
        static int maxVolume  = 6 ;
  public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isOn == false){
	isOn =true;
	System.out.println("Telivision Turned on");
	}
	else if(isOn == true){
	isOn = false;
	System.out.println("Telivision Turned off");
	}
	{
		System.out.println("onOrOff Ended");
		return;
	}
  }

public static void increaseVolume(){
    System.out.println("increaseVolume() started");
  if(isOn == true){
	  System.out.println("Television is connected");
    if(currentVolume < maxVolume	){
	    currentVolume = currentVolume + 1;
    System.out.println("The current Volume is " +currentVolume);	
}else{
	System.out.println("Max Volume Reached");	
}
}else {
	System.out.println("increaseVolume() started");
}
	System.out.println("increaseVolume() ended");
	return;
   }
   public static void decreaseVolume(){
    System.out.println("decreaseVolume() started");
  if(isOn == true){
	  System.out.println("Television is connected");
    if(currentVolume > minVolume	){
	    currentVolume = currentVolume - 1;
    System.out.println("The current Volume is " +currentVolume);	
}else{
	System.out.println("Min Volume Reached");	
}
}else {
	System.out.println("Goobe aste aagadu");
}
	System.out.println("decreaseVolume() ended");
	return;
   }
   
   
   }