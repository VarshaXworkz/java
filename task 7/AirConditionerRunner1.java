class AirConditionerRunner1{
	
	public static void main(String act[]){
		System.out.println("Main started");
		AirConditioner.getFeatures();
		boolean connected = AirConditioner.onOrOff();
	if(connected==true)	
		AirConditioner.increaseTemperature();
	else
		System.out.println();
	System.out.println("Main Ended");
	}
}	