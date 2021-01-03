package academy.belhard;

public class Pilots {

    int id;
    String first_name;
    String last_name;
    String rank;
    String unique_code;
    String email;

    public Pilots(int id, String first_name, String last_name, String rank, String unique_code, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rank = rank;
        this.unique_code = unique_code;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getRank() {
        return rank;
    }

    public String getUnique_code() {
        return unique_code;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setUnique_code(String unique_code) {
        this.unique_code = unique_code;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rank='" + rank + '\'' +
                ", unique_code='" + unique_code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
