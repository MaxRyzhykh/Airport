package academy.belhard;

public class Planes {

    int id;
    String brand;
    String model;
    int passenger_amount;
    String bort_number;

    public Planes(int id, String brand, String model, int passenger_amount, String bort_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.passenger_amount = passenger_amount;
        this.bort_number = bort_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBort_number() {
        return bort_number;
    }

    public void setBort_number(String bort_number) {
        this.bort_number = bort_number;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passenger_amount=" + passenger_amount +
                ", bort_number=" + bort_number +
                '}';
    }
}
