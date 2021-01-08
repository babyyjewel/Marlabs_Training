package comm;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;



public class JDBCDelete{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
                try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded");
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","jewel","jewel");
				   System.out.println("Database Connected");
				   
					
			

					java.sql.Statement st=con.createStatement();
					ResultSet rset= st.executeQuery("select * from employee");
					

					java.sql.Statement st1=con.createStatement();
					
					
					 int rsett= st1.executeUpdate("delete from employee where id=206");
					 
					while(rset.next()) {
						System.out.print(" id="+rset.getInt(1));
						System.out.print("  name="+rset.getString(2));
						System.out.print("  salary="+rset.getInt(3));
							System.out.print("  department ="+rset.getString(4));
							System.out.print(" dob="+rset.getDate(5));
							System.out.print("  address="+rset.getString(6));
							System.out.println(" ");
						
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
	}

}
