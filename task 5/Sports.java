class Sports{


	static String IPLTeamNameas[] = {"Rajasthan Royals","Deccan Chargers","Chennai Super Kings","Kolkata Knight Riders","Mumbai Indians","Sunrisers Hyderabad","Royal Challengers Bangalore"};
	static String Top10BatsMen[] = {"Sachin Tendulkar","Sunil Gavaskar","G Vishwanath","Rahul Dravid","Sourav Ganguly","Kapil Dev","Virender Sehwag","VVS Laxman","Virat Kohli","Dilip Vengsarkar"};
	static String Top10Bowlers[] = {"KAPIL DEV","RAVICHANDRAN ASHWIN","HARBHAJAN SINGH","ZAHEER KHAN","JAVAGAL SRINATH","AJIT AGARKAR","ISHANT SHARMA","RAVINDRA JADEJA","JASPRIT BUMRAH","ROHIT SHARMA"};
	static String Top10ICCTeamNames[] = {"ENGLAND","WEST INDIES","AFGHANISTAN","INDIA","AUSTRALIA","BANGLADESH","ENGLAND","SOUTH AFRICA","USA","WEST INDIES"};
	
	
	public static void main(String[] newCollection){
	
	System.out.println("The Available IPLTeamNameas are: ");
for(int index =0;index<IPLTeamNameas.length ; index++){	
	System.out.println(IPLTeamNameas[index]);
}	
	System.out.println("The Available Top10BatsMen are: ");
for(int index =0;index<Top10BatsMen.length ; index++){	
	System.out.println(Top10BatsMen[index]);
}	
 	System.out.println("The Available Top10Bowlers are: ");	
for(int index =0;index<Top10Bowlers.length ; index++){	
	System.out.println(Top10Bowlers[index]);
	
}
System.out.println("The Available Top10ICCTeamNames are: ");
for(int index =0;index<Top10ICCTeamNames.length ; index++){
	System.out.println(Top10ICCTeamNames[index]);
  }
}

}