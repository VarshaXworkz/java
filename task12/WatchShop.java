class WatchShop {

static String name = "Neel";
static String watchBrandNames[] ={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean createWatchBrandNames(String watchBrandName){
System.out.println("Create watch brands  started");
boolean isWatchBrandCreated =false;
if(index < watchBrandNames.length){
        if(watchBrandName!=null){
	   
          watchBrandNames[index] = watchBrandName;
          index++;
          isWatchBrandCreated =true;
   }else
	   System.out.println("Watch brand  is null ,cannot be found");
   }else{
	   System.out.println("Watch brand are full");
   }
   
   System.out.println("create Watch brand ended");
   return  isWatchBrandCreated;
   }
	public static boolean updateWatchBrandNames(String oldWatchBrandName, String newWatchBrandName){
	   System.out.println("update operation Started");
	    boolean isWatchBrandUpdated = false;
		for(int index =0;index < watchBrandNames.length;index++){
			if(oldWatchBrandName ==watchBrandNames[index]){
				watchBrandNames[index] = newWatchBrandName;
				isWatchBrandUpdated = true;
			}
		}
    if(isWatchBrandUpdated  == false){
        System.out.println(oldWatchBrandName +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isWatchBrandUpdated;
   }		
   public static void getWatchBrandNames(){
   System.out.println("The available Watch brands are :");
   for(String watchBrandName : watchBrandNames){
		System.out.println(watchBrandName);
}
}
public static boolean deleteWatchShop(String watchShopTobeDeleted){
			System.out.println("delete watch shop started");
			boolean iswatchShopDeleted= false;
				int newIndex, oldIndex;
			for(newIndex=0,oldIndex=0;oldIndex<watchShop.length;oldIndex++){
				if(watchShop[oldIndex]!=watchShopTobeDeleted)
				{
					watchShop[newIndex]= watchShop[oldIndex];
					newIndex++;
					iswatchShopDeleted = true;
				}
			}
			watchShop = Arrays.copyOf(watchShop,newIndex);
			if(watchShop != null){
				iswatchShopDeleted = true;
			}
			if(iswatchShopDeleted== false){
				System.out.println(watchShopTobeDeleted + "not found");
			}
				System.out.println("delete watchShop ended");
			return iswatchShopDeleted;	
		} 
}