class Netflix {


	static String Top10Movies[] = {"Mea Culpa","Ruby Gillman, Teenage Kraken","The Abyss","Thanksgiving","The Super Mario Bros. Movie","Players","Lover, Stalker, Killer","Einstein and the Bomb ","Trolls","Code 8"};
	static String EnglishMovies[] = {"Ali","American Graffiti","Burning","Everything Everywhere All at Once","Frances Ha","Glass Onion: A Knives Out Mystery","Godzilla Minus One","Hit Man","Homecoming","Hulk","It Follows","The Killer","King Richard","Living","Marcel the Shell With Shoes On","Marriage Story","May December","Molly’s Game","The Nest","No Hard Feelings","Oldboy","Shrek","Something’s Gotta Give","RRR","The Woman King"};
	static String KannadaMovies[] = {"Kantara","777 Charlie","KGF Chapter 2","Vikranth Rona","James","Gaalipata 2","Old Monk","Guru Shishyaru","Avatara Purusha","Ek Love Ya","Love Mocktail 2","Window Seat","Petromax","Harikathe Alla Girikathe","Family Pack","Case Of Kondana","Blink","Ondu Sarala Premakathe","Kerebete","Shakhahaari","Yuva","O2","Grey Games","KGF","Mungaaru Male"};
	static String HindiMovies[] = {" The Lunchbox","Zindagi Na Milegi Dobara","Yeh Jawaani Hai Deewani"," Taare Zameen Par "," Barfi","Swades","Wake Up Sid","Special 26 ","Queen ","Drishyam ","Pink ","Baahubali"," PK "," Masaan","Sanju"," No One Killed Jessica"," Mimi"," Bareilly ki Barfi ","Pad Man"," Mom ","Udta Punjab","Dear Zindagi","Madras Cafe","Margarita With A Straw","Kabir Singh"};
	static String KoreanSeries[] = {"Crash Landing on You ","Crash Landing on Me ","Squid Game","Kingdom","Hellbound","Our Beloved Summer","Boys Over Flowers ","A Killer Paradox","Parasyte: The Grey","Business Proposal","All of Us Are Dead","D.P.","Physical: 100","Twenty-Five Twenty-One","It's Okay to Not Be Okay","Hometown Cha-Cha-Cha ","Little Women","Mr. Sunshine","Sweet Home","A Time Called You","Crash Landing on You","Extraordinary Attorney Woo","Goblin",",My Demon","When I fly Towards You"};
	
	
public static void main(String[] newCollection){
	
	System.out.println("The Available Top10Movies are:");
for(int index =0;index<Top10Movies.length;index++){
	System.out.println(Top10Movies[index]);
}	
	System.out.println("The Available EnglishMovies are:");
for(int index =0;index<EnglishMovies.length;index++){
	System.out.println(EnglishMovies[index]);
}	
	System.out.println("The Available KannadaMovies are:");
for(int index =0;index<KannadaMovies.length;index++){
	System.out.println(KannadaMovies[index]);
}	
	System.out.println("The Available HindiMovies are:");
for(int index =0;index<HindiMovies.length;index++){
	System.out.println(HindiMovies[index]);
}
	System.out.println("The Available KoreanSeries are:");
for(int index =0;index<KoreanSeries.length;index++){
	System.out.println(KoreanSeries[index]);
}		
}
} 