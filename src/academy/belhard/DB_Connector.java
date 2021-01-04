package academy.belhard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

public class DB_Connector {

    private Connection connection;

    private static final String ADD_PILOTS = "INSERT INTO pilots(id,first_name,last_name,rank,unique_code,email) VALUES (?,?,?,?,?,?)";
    private static final String ADD_PLANES = "INSERT INTO planes(id,brand,model,passenger_amount,bort_number) VALUES (?,?,?,?,?)";
    private static final String ADD_FLIGHTS = "INSERT INTO flights(id,plane_id,pilot_id,date_f,time_f,flight_No) VALUES (?,?,?,?,?,?)";
    private static final String REQUEST = "SELECT fl.flight_No, fl.date_f, fl.time_f, pl.bort_number, pl.brand, pl.model, pl.passenger_amount, pi.last_name, pi.first_name, pi.unique_code, pi.rank FROM flights fl JOIN planes pl ON fl.plane_id = pl.id JOIN pilots pi ON fl.pilot_id = pi.id";

    public DB_Connector(Connection connection) {
        this.connection = connection;
    }

    public void add_pilot(Pilots pilot) {
        try (PreparedStatement statement = connection.prepareStatement(ADD_PILOTS)) {
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirst_name());
            statement.setString(3, pilot.getLast_name());
            statement.setString(4, pilot.getRank());
            statement.setString(5, pilot.getUnique_code());
            statement.setString(6 , pilot.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add_plane(Planes plane) {
        try (PreparedStatement statement = connection.prepareStatement(ADD_PLANES)) {
            statement.setInt(1, plane.getId());
            statement.setString(2, plane.getBrand());
            statement.setString(3, plane.getModel());
            statement.setInt(4, plane.getPassenger_amount());
            statement.setString(5, plane.getBort_number());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add_flight(Flights flight) {
        try (PreparedStatement statement = connection.prepareStatement(ADD_FLIGHTS)) {
            java.sql.Date date = java.sql.Date.valueOf(flight.getDate_f());
            java.sql.Time time = java.sql.Time.valueOf(flight.getTime_f());

            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getPlane_id());
            statement.setInt(3, flight.getPilot_id());
            statement.setDate(4, date);
            statement.setTime(5, time);
            statement.setString(6, flight.getFlight_No());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readRecords() {
        try (PreparedStatement statement = connection.prepareStatement(REQUEST)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String city = result.getString("city");
                String street = result.getString("street");
                int house_number = result.getInt("house_number");
                int corps_number = result.getInt("corps_number");
                int apartment_number = result.getInt("apartment_number");
                String flight_No = result.getString(1);
                LocalDate date_f = result.getDate(2);
                LocalTime time_f = result.getTime(3);
                String bort_number = result.getString(4);
                String brand = result.getString(5);
                String model = result.getString(6);
                int passenger_amount
                String last_name = result.getString(8);
                String first_name = result.getString(9);
                String unique_code = result.getString(10);
                String rank = result.getString(11);

                    Address a = new Address(id, city, street, house_number, corps_number, apartment_number);

                res.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
}
