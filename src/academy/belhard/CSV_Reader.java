package academy.belhard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class CSV_Reader {
    public Flights read_flights(String file) {
        String csvFile = file;
        String line;
        String csvSplitBy = ",";
        int id;
        int pl_id;
        int pi_id;
        LocalDate d_f;
        LocalTime t_f;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] storage = line.split(csvSplitBy);
                id = Integer.parseInt(storage[0]);
                pl_id = Integer.parseInt(storage[1]);
                pi_id = Integer.parseInt(storage[2]);
                d_f = LocalDate.parse(storage[3]);
                t_f = LocalTime.parse(storage[4]);
//                Flights flight = new Flights(id, pl_id, pi_id, d_f, t_f);

                return new Flights(id, pl_id, pi_id, d_f, t_f);
//                System.out.println("new Flight recorded: " + flight.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pilots read_pilots(String file) {
        String csvFile = file;
        String line;
        String csvSplitBy = ",";
        int id;
        String f_n;
        String l_n;
        String rank;
        String u_c;
        String email;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] storage = line.split(csvSplitBy);
                id = Integer.parseInt(storage[0]);
                f_n = storage[1];
                l_n = storage[2];
                rank = storage[3];
                u_c = storage[4];
                email = storage[5];
//                Pilots pilot = new Pilots(id, f_n, l_n, rank, u_c, email);

                return new Pilots(id, f_n, l_n, rank, u_c, email);
//                System.out.println("new Pilot recorded: " + pilot.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Planes read_planes(String file) {
        String csvFile = file;
        String line;
        String csvSplitBy = ",";
        int id;
        String bd;
        String ml;
        int p_a;
        String b_n;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] storage = line.split(csvSplitBy);
                id = Integer.parseInt(storage[0]);
                bd = storage[1];
                ml = storage[2];
                p_a = Integer.parseInt(storage[3]);
                b_n = storage[4];
//                Planes plane = new Planes(id, bd, ml, p_a, b_n);

                return new Planes(id, bd, ml, p_a, b_n);
//                System.out.println("new Plane recorded: " + plane.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
