package tugasbesar;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DB {
	
	static Connection con;
	
	//method koneksi database
	public static Connection connection(){
		if(con == null){
			MysqlDataSource data = new MysqlDataSource();
			data.setDatabaseName("inventaris_kelas");
			data.setUser("root");
			data.setPassword("");
			try{
				con = data.getConnection();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		return con;
	}
}