package okjava0718.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EventRegist {
	String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	String jdbcUrl="jdbc:oracle:thin:@localhost:1521:TESTDB";
	Connection conn;
	PreparedStatement pstmt;
	
	Scanner scanner=new Scanner(System.in);
	
	public void printList(){
		System.out.println("전체보기");
		String sql="select * from event";
		ResultSet rs=null;
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("uname")+","+rs.getString("email"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	void connectDB(){
		try{
			Class.forName(jdbcDriver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			conn=DriverManager.getConnection(jdbcUrl,"scotty","tiger");
		}catch(SQLException e){
			e.printStackTrace(); 
		}
	}
	
	public EventRegist(){
		connectDB();
		
		System.out.println("이벤트 설정");
		System.out.println("이름");
		String uname=scanner.next();
		System.out.println("이메일");
		String email=scanner.next();
		
		registUser(uname,email);
		closeDB(conn,pstmt);
	}

	void closeDB(Connection conn,Statement pstmt){
		try{
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	void registUser(String uname,String email){
		try{
			String sql="insert into event values(?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args){
		EventRegist e=new EventRegist();
	}
}