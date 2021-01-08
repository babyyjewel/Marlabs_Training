package comm;
//import java.sql.SQLException;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class MainApp3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				  

					java.sql.Statement st=con.createStatement();
			    	ResultSet rset= st.executeQuery( "create table customerss as select * from customers ");
					

					 
					while(rset.next()) {
						
							System.out.print("  id="+rset.getInt(1));
							System.out.print("  name="+rset.getString(2));
							System.out.print("  address="+rset.getString(3));
							System.out.println(" ");
					
							//System.out.println("name = "+rset.getString(1));
					
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}



