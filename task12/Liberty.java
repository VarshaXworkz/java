class Liberty{

static String name = "Liberty";
static String shoeBrands[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addShoeBrandNames(String shoeBrand){
System.out.println("Create liberty brand names started");
boolean isShoeBrandNameCreated =false;
if(index < shoeBrands.length){
        if(shoeBrand!=null){ 
          shoeBrands[index] = shoeBrand;
          index++;
          isShoeBrandNameCreated =true;
   }else
	   System.out.println("Shoe brand is null ,cannot be found");
   }else{
	   System.out.println("Shoe brands are full");
   }
   
   System.out.println("create Shoe brand names ended");
   return  isShoeBrandNameCreated;
   }
   public static boolean updateShoeBrandName(String oldShoeBrandName, String newShoeBrandName){
	   System.out.println("update operation Started");
	    boolean isShoeNameUpdated = false;
		for(int index =0;index < shoeBrands.length;index++){
			if(oldShoeBrandName == shoeBrands[index]){
				shoeBrands[index] = newShoeBrandName;
				isShoeNameUpdated = true;
			}
		}
    if(isShoeNameUpdated  == false){
        System.out.println(oldShoeBrandName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isShoeNameUpdated;
   }		
   public static void getAllShoeBrandName(){
   System.out.println("The available Brand Names are :");
   for(String shoeBrand : shoeBrands){
   System.out.println(shoeBrand);
}
}
}
   
