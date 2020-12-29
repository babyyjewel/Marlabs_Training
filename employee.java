import java.util.*;
class employee{      

     public static void main(String args[]){ 
          String id = " " ;
           String name = " ";
            String des = " ";
              int i=1;



        System.out.println("Press 1 or 2");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Your choice is" + choice );

    
         switch(choice)
         {
           
             case 1 :  System.out.println("Enter Employee ID");
      			   id = sc.next();
                          
                 	System.out.println("Enter Employee Name");
      			   name = sc.next();	
			
			System.out.println("Designation");  
      			  des = sc.next();

 		  	
              
                           

		case 2: System.out.println("Press 1 or 2");
                          choice = sc.nextInt();
                        System.out.println("Employee ID :" + id );
			System.out.println("Employee Name :" + name );
			System.out.println("Employee Designation :" + des );

		   
     
		default : System.out.println("Press 1 or 2");
                          choice = sc.nextInt();
                         System.out.println("Invalid Entry");
 				break;

	}
       

}
}