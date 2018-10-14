package $003;


	
public enum Gender{
	
	MALE,FEMALE;
	
	/*public static final Gender MALE =new Gender() ;
	public static final Gender FEMALE = new Gender();
     private Gender() {
    	 
    	 
     }*/
	
     public String toString() {
    	 if(this==Gender.MALE) {
    		 return "Male";
    	 }else {
    		 return "Female";
    	 }
    	 
     }
}
