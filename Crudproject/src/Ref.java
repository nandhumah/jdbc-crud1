import java.sql.*;
public class Ref {
	public  static void createstudent1() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="0908";
		String Query="insert into apple values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 100);
		pst.setString(2,"iphone14");
	    pst.setInt(3, 79000);
	    pst.executeUpdate();
	    con.close();
	}
	public static void main(String[]args) throws Exception{
	 createstudent1();
	}
}
