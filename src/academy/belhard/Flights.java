package academy.belhard;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flights {

    int id;
    int plane_id;
    int pilot_id;
    LocalDate date_f;
    LocalTime time_f;
    String flight_No;

    public Flights(int id, int plane_id, int pilot_id, LocalDate date_f, LocalTime time_f, String flight_No) {
        this.id = id;
        this.plane_id = plane_id;
        this.pilot_id = pilot_id;
        this.date_f = date_f;
        this.time_f = time_f;
        this.flight_No = flight_No;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(int plane_id) {
        this.plane_id = plane_id;
    }

    public int getPilot_id() {
        return pilot_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilot_id = pilot_id;
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

    public String getFlight_No() {
        return flight_No;
    }

    public void setFlight_No(String flight_No) {
        this.flight_No = flight_No;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", plane_id=" + plane_id +
                ", pilot_id=" + pilot_id +
                ", date_f=" + date_f +
                ", time_f=" + time_f +
                '}';
    }
}
