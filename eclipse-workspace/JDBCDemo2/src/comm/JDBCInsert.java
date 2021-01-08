package comm;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;



public class JDBCInsert{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				   
					
			
				   

					  java.sql.Statement st2= con.createStatement(); 
					  java.sql.PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
					  pst.setInt(1,403); pst.setString(2,"Rony"); pst.setInt(3,40000);
					  pst.setString(4,"HR"); pst.setDate(5,java.sql.Date.valueOf("2013-09-04"));
					  pst.setString(6,"Thrissur");
					  pst.executeUpdate();
					  
					  

					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}
