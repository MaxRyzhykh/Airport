package academy.belhard;

import java.sql.Connection;

public class DB_Connector extends CSV_Reader {

    private Connection connection;

    private static final String ADD_PILOTS = "INSERT INTO pilots(id,first_name,last_name,rank,unique_code,email) VALUES (?,?,?,?,?,?)";
    private static final String ADD_PLANES = "INSERT INTO planes(id,brand,model,passenger_amount,bort_number) VALUES (?,?,?,?,?)";
    private static final String ADD_FLIGHTS = "INSERT INTO flights(id,plane_id,pilot_id,date_f,time_f) VALUES (?,?,?,?,?)";

    public DB_Connector(Connection connection) {
        this.connection = connection;
    }

}
