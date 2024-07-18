class GoldShop{
static String name = "Vasavi";
static String goldItems[] ={null,null,null,null,null,null,null};
static int index;

public static boolean createGoldItems(String goldItem){
System.out.println("Create gold items started");
boolean isGoldItemCreated =false;
if(index < goldItems.length){
        if(goldItem!=null){
	   
          goldItems[index] = goldItem;
          index++;
          isGoldItemCreated =true;
   }else
	   System.out.println("Gold item  is null ,cannot be found");
   }else{
	   System.out.println("gold items are full");
   }
   
   System.out.println("create gold items ended");
   return  isGoldItemCreated;
   }
   
   
   public static boolean updateGoldItem(String oldGoldItem, String newGoldItem){
	   System.out.println("update operation Started");
	    boolean isGoldItemUpdated = false;
		for(int index =0;index < goldItems.length;index++){
		if(oldGoldItem == goldItems[index]){
				goldItems[index] = newGoldItem;
				isGoldItemUpdated = true;
			}
		}
    if(isGoldItemUpdated  == false){
        System.out.println(oldGoldItem +"Not Found");
	} 		
	   System.out.println("update operation Ended");
        return isGoldItemUpdated;
   }		
   public static void getGoldItems(){
   System.out.println("The available Gold items are :");
   for(String goldItem : goldItems){
   System.out.println(goldItem);
}
}
		public static boolean deleteGoldShop(String goldShopTobeDeleted){
			System.out.println("delete gold shop started");
			boolean isgoldShopDeleted= false;
				int newIndex, oldIndex;
			for(newIndex=0,oldIndex=0;oldIndex<goldShop.length;oldIndex++){
				if(goldShop[oldIndex]!=goldShopTobeDeleted)
				{
					goldShop[newIndex]= goldShop[oldIndex];
					newIndex++;
					isgoldShopDeleted = true;
				}
			}
			goldShop = Arrays.copyOf(goldShop,newIndex);
			if(goldShop != null){
				isgoldShopDeleted = true;
			}
			if(isgoldShopDeleted== false){
				System.out.println(goldShopTobeDeleted + "not found");
			}
				System.out.println("delete goldShop ended");
			return isgoldShopDeleted;	
		} 

}