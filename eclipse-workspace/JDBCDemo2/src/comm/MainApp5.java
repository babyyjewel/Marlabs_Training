package comm;
//import java.sql.SQLException;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class MainApp5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				   
					
				   
					
					//  java.sql.Statement st2= con.createStatement(); 
					 // java.sql.PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
					 // pst.setInt(1,403); pst.setString(2,"Rony"); pst.setInt(3,40000);
					 // pst.setString(4,"HR"); pst.setDate(5,java.sql.Date.valueOf("2013-09-04"));
					 // pst.setString(6,"Thrissur");
					 
					  
				//	  java.sql.PreparedStatement pst = con.prepareStatement("update employee set id = ? where id = 403");
					  
				//	  pst.setInt(1,406);
					
				//	  pst.executeUpdate();
				   

					java.sql.Statement st=con.createStatement();
			    	ResultSet rset= st.executeQuery("select name from employee where dob between '1990-01-01' and '1999-01-01' ");
					

			//	java.sql.Statement st1=con.createStatement();
				//	int rsett= st1.executeUpdate("insert into employee values(206,'Meenu',30000,'Admin','1990-09-09','Kerala')");
					//	System.out.println("Value inserted");
					 
					
			//	 int rsett= st1.executeUpdate("delete from employee where id=406");
					 
					while(rset.next()) {
					
						System.out.println("  name="+rset.getString(1));
					
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}


