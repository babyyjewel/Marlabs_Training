package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ScannerDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
		   System.out.println("Database Connected");
	
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the employee id to be deleted : ");
	        int id = sc.nextInt();
	        String sql = "delete from employee where id = ?;";
	        java.sql.PreparedStatement pst = con.prepareStatement(sql);
	        pst.setInt(1, id);
	       int i = pst.executeUpdate();
	       if(i>0) {
	    	   System.out.println("Record Deleted");
	       }
	       else {
	    	   System.out.println("No Such Employee");
	       }
	        java.sql.Statement st=con.createStatement();
			ResultSet rset= st.executeQuery("select * from employee");
			


			 
			 
			while(rset.next()) {
				System.out.print(" id="+rset.getInt(1));
				System.out.print("  name="+rset.getString(2));
				System.out.print("  salary="+rset.getInt(3));
					System.out.print("  department ="+rset.getString(4));
					System.out.print(" dob="+rset.getDate(5));
					System.out.print("  address="+rset.getString(6));
					System.out.println(" ");
				
			}
		
		
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
