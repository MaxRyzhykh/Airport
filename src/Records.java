import java.time.LocalDate;
import java.time.LocalTime;

public class Records {

    String flight_No;
    LocalDate date_f;
    LocalTime time_f;
    String bort_number;
    String brand;
    String model;
    int passenger_amount;
    String last_name;
    String first_name;
    String unique_code;
    String rank;

    public Records(String flight_No, LocalDate date_f, LocalTime time_f, String bort_number, String brand, String model, int passenger_amount, String last_name, String first_name, String unique_code, String rank) {
        this.flight_No = flight_No;
        this.date_f = date_f;
        this.time_f = time_f;
        this.bort_number = bort_number;
        this.brand = brand;
        this.model = model;
        this.passenger_amount = passenger_amount;
        this.last_name = last_name;
        this.first_name = first_name;
        this.unique_code = unique_code;
        this.rank = rank;
    }

    public String getFlight_No() {
        return flight_No;
    }

    public void setFlight_No(String flight_No) {
        this.flight_No = flight_No;
    }

    public LocalDate getDate_f() {
        return date_f;
    }

    public void setDate_f(LocalDate date_f) {
        this.date_f = date_f;
    }

    public LocalTime getTime_f() {
        return time_f;
    }

    public void setTime_f(LocalTime time_f) {
        this.time_f = time_f;
    }

    public String getBort_number() {
        return bort_number;
    }

    public void setBort_number(String bort_number) {
        this.bort_number = bort_number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassenger_amount() {
        return passenger_amount;
    }

    public void setPassenger_amount(int passenger_amount) {
        this.passenger_amount = passenger_amount;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUnique_code() {
        return unique_code;
    }

    public void setUnique_code(String unique_code) {
        this.unique_code = unique_code;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
