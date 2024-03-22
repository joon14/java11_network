package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestAnswer5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//문제1. 아래 코드 부분에서 url을 나타내는 "jdbc:mysql://localhost:3306" 문장에서 데이터베이스 이름이 지정되지 않았으므로 해당 데이터베이스에 연결되지 않는다.
			//-> Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh","root","1234");로 변경하여 데이터베이스를 연결하도록 한다.
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh","root","1234");//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234");
			
			//문제2. 아래 코드 부분에서 아직 query의 sql 구문이 지정되지 않았으므로(실행문이 없으므로) query를 실행하지 못한다.
			//-> 위 빈 줄에 query에 대한 sql문을 작성한다. String query = "select emp_id, emp_name from employee"; 추가
			String query = "select emp_id, emp_name from employee";
			PreparedStatement st = conn.prepareStatement(query);
			
			//문제3. 아래 코드 부분에서 executeUpdate() 메소드는 int를 반환하므로 해당 검색 결과인 ResultSet을 반환받을 수 없다.
			//-> ResultSet rs = st.executeQuery(); 로 변경
			ResultSet rs = st.executeQuery();//ResultSet rs = st.executeUpdate();
			
			//문제4. 아래 코드 부분에서 rs는 다음 레코드를 지정해야 레코드가 끝날 때까지 반복수행할 수 없으므로 진행되지 못한다.
			//-> while문이 반복수행이 될 수 있도록 rs.next로 변경
			while(rs.next()) {//while(rs) {
				//문제5. 아래 코드 부분에서 empId와 empName 컬럼이 존재하지 않으므로 해당 컬럼에 접근할 수 없다.
				//-> System.out.println(rs.getString("emp_id")+" / "+rs.getString("emp_name")); 로 올바르게 수정한다.
				System.out.println(rs.getString("emp_id")+" / "+rs.getString("emp_name"));//System.out.println(rs.getString("empId")+" / "+rs.getString("empName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
