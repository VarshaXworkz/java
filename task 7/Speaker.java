class Speaker{
static boolean isOn = false;
       static int  currentVolume  ; 
	   static  int    minVolume  ; 
        static int maxVolume  = 6 ;
  public static void  onOrOff(){
	System.out.println("onOrOff Started");
	if(isOn == false){
	isOn =true;
	System.out.println("Speaker Turned on");
	}
	else if(isOn == true){
	isOn = false;
	System.out.println("Speaker Turned off");
	}
	{
		System.out.println("onOrOff Ended");
		return;
	}
  }

public static void increaseVolume(){                        //increaseVolume() is a purpose or functionality of having a program
    System.out.println("increaseVolume started");
  if(isOn == true){
    if(currentVolume < maxVolume	){
	    currentVolume = currentVolume + 1; // update operation and currentVolume is called variable
    System.out.println("The current Volume is " +currentVolume);	
	}else{
	System.out.println("Max Volume Reached");	
	}
}else {
}
	System.out.println("increaseVolume Ended");
	return;
   }
   }
   
   
   