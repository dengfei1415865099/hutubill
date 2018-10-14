import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hutubill" +
                        "?characterEncoding=UTF-8",
                        "root","admin");
                Statement s = c.createStatement();
                ){
            String sql = "select* from config";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
            }
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
