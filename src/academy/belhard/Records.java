package academy.belhard;

import java.time.LocalDate;
import java.time.LocalTime;

public class Records {

    String flight_No;
    LocalDate date_f;
    LocalTime time_f;
    String bort_number;
    String brand_model;
    int passenger_amount;
    String name;
    String unique_code;
    String rank;

    public Records(String flight_No, LocalDate date_f, LocalTime time_f, String bort_number, String brand_model, int passenger_amount, String name, String unique_code, String rank) {
        this.flight_No = flight_No;
        this.date_f = date_f;
        this.time_f = time_f;
        this.bort_number = bort_number;
        this.brand_model = brand_model;
        this.passenger_amount = passenger_amount;
        this.name = name;
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

    public String getBrand_Model() {
        return brand_model;
    }

    public void setBrand(String brand_model) {
        this.brand_model = brand_model;
    }

    public int getPassenger_amount() {
        return passenger_amount;
    }

    public void setPassenger_amount(int passenger_amount) {
        this.passenger_amount = passenger_amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Records{" +
                "flight_No= " + flight_No +
                ", date_f= " + date_f +
                ", time_f= " + time_f +
                ", bort_number= " + bort_number +
                ", brand_model= " + brand_model +
                ", passenger_amount= " + passenger_amount +
                ", name= " + name +
                " , unique_code= " + unique_code +
                '}' + " (rank= " + rank + " )";
    }
}
