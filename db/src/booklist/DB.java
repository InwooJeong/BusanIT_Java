package booklist;

import java.sql.*;

public class DB {
	Connection con;
	
	public DB() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("DB연결 준비");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("DB연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			while(rs.next()) {
				System.out.print("\t"+rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t\t"+rs.getString(3));
				System.out.println("\t"+rs.getInt(4));
			}
			
			//con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void cusSel() {
		String query = "SELECT	*"
				+ "		FROM	customer";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("CUST ID \tNAME \t\tADDRESS \tPHONE");
			while(rs.next()) {
				System.out.print("\t"+rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t\t"+rs.getString(3));
				System.out.println("\t"+rs.getString(4));
			}
			
			//con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}	