package HRH;

import java.time.LocalDate;

public interface AnimalShop {
    void Buy(Animal animal);

    void Serve(Customer customer,Animal animal);

    void Off(LocalDate date);
}
