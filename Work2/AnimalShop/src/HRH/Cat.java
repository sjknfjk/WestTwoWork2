package HRH;

public class Cat extends Animal{
    double price=200;

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
        return "Cat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
