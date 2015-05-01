
import java.sql.SQLException;

//import oracle.jdbc.pool.OracleConnectionPoolDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) throws SQLException {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	Sample s  = (Sample)ctx.getBean("sampleBean");
	
	System.out.println("x======"+s.getX());
	System.out.println("y======"+s.getY());	
	
	
	
}
}
