package utility;



import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBHelper {

        @SuppressWarnings("empty-statement")
	public static Connection getConnection() throws Exception {
		Properties p = new Properties();            
		p.load(new FileReader("configuration"));
                Class.forName(p.getProperty("db.driver"));
		Connection c = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"),
				p.getProperty("db.password"));

		return c;
	}

}