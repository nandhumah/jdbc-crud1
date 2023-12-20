
import java.sql.*;
public class Update1 {
	public static void createstudent2() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="0908";
		String Query="update apple set product_name='iphone15' where product_id= 100 ";
		Connection con=DriverManager.getConnection(url, username, password);
	    PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
       public static void main(String[]args) throws Exception{
    	   createstudent2();
       }
}
