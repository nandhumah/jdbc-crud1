import java.sql.*;
public class Get1 {
  public static void getstudent1()throws Exception{
	  String url="jdbc:mysql://127.0.0.1:3306/product";
	  String username="root";
	  String password="0908";
	  String Query="select* from apple";
	  Connection con=DriverManager.getConnection(url, username, password);
	  Statement pst=con.createStatement();
	  ResultSet rs=pst.executeQuery(Query);
	  while(rs.next()) {
		  System.out.println("product_id"+rs.getInt(1));
		  System.out.println("product_name"+rs.getString(2));
		  System.out.println("product_price"+rs.getString(3));
		 
	  }
	  
	  con.close();
 
  }
  public static void main(String[]args) throws Exception{
	  getstudent1();
  }
}
