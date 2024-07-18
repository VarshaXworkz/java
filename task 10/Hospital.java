class Hospital {
	static String patientNm;
	static String diSease;
	static String bloodGroup;
	static String dR;
	static String patientId;
	static String prescription;
	static String hospitalBranch;
	static String age;
	static String weighT;


		public static boolean createAmazonAccount(String patientname,String disease,String bloodGroup,String doctor,String patientid,String prescripTion,String hospitaLBranch,String agE){
	boolean isAccountCreated=false;
	boolean isuserNamevalid = false;
	boolean ispasswordvalid = false;
	boolean isdateOfBirthvalid = false;
	boolean isplacevalid = false;
	boolean isagvalid = false;

		if(pa	!= null){
				usrn=userName;
					isuserNamevalid=true;
		}else{
			  System.out.println("Please provide valid dcdrlocation");
		}
		if(password	!= null){
				pwd=password;
					ispasswordvalid=true;
		}else{
			  System.out.println("Please provide valid password");
		}
		if(dateOfBirth!= null){
				dob=dateOfBirth;
					isdateOfBirthvalid=true;
		}else{
			  System.out.println("Please provide valid date of birth");
		}
		if(age!= null){
				ag=age;
					isagvalid=true;
		}else{
			  System.out.println("Please provide valid age");
		}
		if(place!= null){
				plac=place;dr7
					isplacevalid=true;
		}else{
			  System.out.println("Please provide valid place");
		}	
		if(userName	!= null){
				usrn=userName;
					isuserNamevalid=true;
		}else{
			  System.out.println("Please provide valid dcdrlocation");
		}
		if(password	!= null){
				pwd=password;
					ispasswordvalid=true;
		}else{
			  System.out.println("Please provide valid password");
		}
		if(dateOfBirth!= null){
				dob=dateOfBirth;
					isdateOfBirthvalid=true;
		}else{
			  System.out.println("Please provide valid date of birth");
		}
		if(age!= null){
				ag=age;
					isagvalid=true;
		}else{
			  System.out.println("Please provide valid age");
		}
		if(place!= null){
				plac=place;dr7
					isplacevalid=true;
		}else{
			  System.out.println("Please provide valid place");
		}	
		if(isuserNamevalid && ispasswordvalid && isdateOfBirthvalid && isplacevalid && isagvalid){
				isAccountCreated = true;
		}
	return isAccountCreated;
		}
		 public static void getAmazonDetails(){
		 System.out.println("Enter your account details");
		 System.out.println("The username is :" + usrn);
		 System.out.println("The password is :" + pwd);
		 System.out.println("The dateOfBirth is:" + dob);
		 System.out.println("The place is :" +plac);
		 System.out.println("The age is:"+ag);
		
	}
}