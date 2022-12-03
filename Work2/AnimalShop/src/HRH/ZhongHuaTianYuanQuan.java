package HRH;

public class ZhongHuaTianYuanQuan extends Animal{
    boolean isVaccineInjected;
    double price=100;

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ZhongHuaTianYuanQuan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", sex=" + sex +
                ", isVaccineInjected=" + isVaccineInjected +
                '}';
    }
}
