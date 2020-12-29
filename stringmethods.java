class stringmethods{
     public static void main(String args[]){

	String s = "jewel";
        String ss = "            me";
	System.out.println(s);  
	System.out.println(s.toUpperCase());	     
	System.out.println(s.toLowerCase());
	s= s.concat(" baby");	
	System.out.println(s); 
        char re = s.charAt(0); 
	System.out.println(re); 
	System.out.println(s.indexOf("l")); 
	System.out.println(s.substring(0,4)); 
	  System.out.println(s.compareTo(ss));
	System.out.println(s.equals(ss));
	System.out.println(ss); 
	System.out.println(ss.trim()); 
	 
         

	String s2 = new String("Hello");
	System.out.println(s2);	
	System.out.println(s2.toUpperCase());
      
     
	   StringBuffer s3 = new StringBuffer("Hi");
	System.out.println(s3);	
        s3.append(" Jewel");
        System.out.println(s3);	
	
	StringBuilder s4 = new StringBuilder("Welcome");
	System.out.println(s4);	
	s4.append(" Jewel");
        System.out.println(s4);



}
}