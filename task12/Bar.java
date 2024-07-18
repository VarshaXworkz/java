class Bar{

static String name = "Baar";
static String wineBrands[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addWineBrandNames(String wineBrand){
System.out.println("Create wine brand names started");
boolean isBrandNameCreated =false;
if(index < wineBrands.length){
        if(wineBrand!=null){
	   
          wineBrands[index] = wineBrand;
          index++;
          isBrandNameCreated =true;
   }else
	   System.out.println("Wine brand is null ,cannot be found");
   }else{
	   System.out.println("Wine brands are full");
   }
   
   System.out.println("create Wine brand names ended");
   return  isBrandNameCreated;
   }
   public static boolean updateWineBrandName(String oldWineBrandName, String newWineBrandName){
	   System.out.println("update operation Started");
	    boolean isBrandNameUpdated = false;
		for(int index =0;index < wineBrands.length;index++){
			if(oldWineBrandName == wineBrands[index]){
				wineBrands[index] = newWineBrandName;
				isBrandNameUpdated = true;
			}
		}
    if(isBrandNameUpdated  == false){
        System.out.println(oldWineBrandName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isBrandNameUpdated;
   }		
   public static void getWineBrandName(){
   System.out.println("The available Brand Names are :");
   for(String wineBrand : wineBrands){
   System.out.println(wineBrand);
}
}
public static boolean deleteBar(String barTobeDeleted){
			System.out.println("delete bar started");
			boolean isbarDeleted= false;
				int newIndex, oldIndex;
			for(newIndex=0,oldIndex=0;oldIndex<bar.length;oldIndex++){
				if(bar[oldIndex]!=barTobeDeleted)
				{
					bar[newIndex]= bar[oldIndex];
					newIndex++;
					isbarDeleted = true;
				}
			}
			bar = Arrays.copyOf(bar,newIndex);
			if(bar != null){
				isbarDeleted = true;
			}
			if(isbarDeleted== false){
				System.out.println(barTobeDeleted + "not found");
			}
				System.out.println("delete bar ended");
			return isbarDeleted;	
		} 
}
   
