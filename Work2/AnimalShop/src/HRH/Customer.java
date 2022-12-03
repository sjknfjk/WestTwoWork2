package HRH;

import java.time.LocalDate;

public class Customer {
    String name;
    int times;
    LocalDate date;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", times=" + times +
                ", date=" + date +
                '}';
    }
}
