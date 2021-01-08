package comm;
//import java.sql.SQLException;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.time.LocalDateTime;

public class MainApp12 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				  

					java.sql.Statement st=con.createStatement();
			    	ResultSet rset= st.executeQuery("select now() ");
					
			    	LocalDateTime current = LocalDateTime.now();
			    	System.out.println("Current Date and Time is: " + current);

					 
					while(rset.next()) {
						System.out.print(rset.getTime(1) + " " + rset.getDate(1));
		   		
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}


