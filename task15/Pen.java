class Pen{
	String name;
	int id;
	String color;
	double price;
	
		public Pen(){
		
		}
	
		public Pen(String name,int id, String color,double price){
		this.name=name;
		this.id=id;
		this.color=color;
		this.price=price;
		}
		public void write(){
		System.out.println("writing in book");

		}
		public void getPenInfo(){
		System.out.println(name+id+color+price);
		}
		
}
