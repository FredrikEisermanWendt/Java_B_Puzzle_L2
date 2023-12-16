import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DSource {


    private String URL = "jdbc:mariadb://localhost:3306/northwind";
    private String USER = "root";
    private String password = "Eiserman93";


    Connection connection;

    public void open() {
        try {
            connection = DriverManager.getConnection(URL, USER, password);
            System.out.println("Database connected");
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }




}
