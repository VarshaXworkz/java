class new3 {


	static String chocolates[] = {"Dairy Milk","Kit Kat","Perk","Milky Bar","Temptations","Safari","Snickers"};	
public static void main(String[] newCollection){
	
	System.out.println("The Available Chocolates are:" +chocolates.length);
for(int index=0 ; index < chocolates.length-1 ;index++){
	System.out.println(chocolates[index]);
	index=index+1;
	//for each loop
	for(String chocolate:chocolates){
		System.out.println(chocolate);
}
for(String chocolate: chocolates){
	System.out.println(chocolate);
}
}
}
}