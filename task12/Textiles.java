class Textiles {

static String name = "Trends";
static String trendsBrands[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addTrendsBrandNames(String trendsBrand){
System.out.println("Create liberty brand names started");
boolean isTrendsBrandNameCreated =false;
if(index < trendsBrands.length){
        if(trendsBrand!=null){ 
          trendsBrands[index] = trendsBrand;
          index++;
          isTrendsBrandNameCreated =true;
   }else
	   System.out.println("Shoe brand is null ,cannot be found");
   }else{
	   System.out.println("Shoe brands are full");
   }
   
   System.out.println("create Trends brand names ended");
   return  isTrendsBrandNameCreated;
   }
   public static boolean updateTrendsBrandName(String oldTrendsBrandName, String newTrendsBrandName){
	   System.out.println("update operation Started");
	    boolean isTrendsNameUpdated = false;
		for(int index =0;index < trendsBrands.length;index++){
			if(oldTrendsBrandName == trendsBrands[index]){
				trendsBrands[index] = newTrendsBrandName;
				isTrendsNameUpdated = true;
			}
		}
    if(isTrendsNameUpdated  == false){
        System.out.println(oldTrendsBrandName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isTrendsNameUpdated;
   }		
   public static void getAllTrendsBrandName(){
   System.out.println("The available Brand Names are :");
   for(String trendsBrand : trendsBrands){
   System.out.println(trendsBrand);
}
}
}