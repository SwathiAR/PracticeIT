
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertRecord(Student e){		
		String query = "insert into student values('"+e.getsNumber()+"','"+e.getName()+"','"+e.getDept()+"')";
		return jdbcTemplate.update(query);
		
	}
	
	public void selectRecord() throws SQLException{
		String query ="select * from Student";
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(query);
		System.out.println(rows.size());
		
			for (Map<String,Object> row : rows) { 				
				for(Map.Entry<String,Object> entry : row.entrySet()){
					System.out.println(entry.getKey()+"---"+entry.getValue());
				}
				System.out.println("======================");
			}
			
			
	}
		
	
	
	
	

}
