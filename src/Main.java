import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mirkodb", "developer", "developer");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select first_name,last_name from students");

                ArrayList<String> surnames = new ArrayList<>();

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("first_name"));
                    surnames.add(resultSet.getString("last_name"));
                }
                System.out.println(surnames);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }