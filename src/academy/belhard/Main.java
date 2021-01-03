package academy.belhard;

import java.sql.*;

public class Main {

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/airport_db?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DB_Connector db_connector = new DB_Connector(connection);

        CSV_Reader csv_reader = new CSV_Reader();
        csv_reader.read_flights("./db/data/flights.csv");
        csv_reader.read_pilots("./db/data/pilots.csv");
        csv_reader.read_planes("./db/data/planes.csv");
    }
}