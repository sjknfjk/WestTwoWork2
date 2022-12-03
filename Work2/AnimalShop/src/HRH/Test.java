package HRH;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyAnimalShop myAnimalShop=new MyAnimalShop();
        myAnimalShop.money1=1000;
        myAnimalShop.money=1000;
        Cat cat1=new Cat();
        cat1.name="哈哈";
        cat1.age=1;
        cat1.sex=false;
        ZhongHuaTianYuanQuan dog1=new ZhongHuaTianYuanQuan();
        dog1.name="哇哇";
        dog1.age=2;
        dog1.sex=true;
        dog1.isVaccineInjected=true;
        CangShu cangShu1=new CangShu();
        cangShu1.name="咔咔";
        cangShu1.age=1;
        cangShu1.sex=false;
        myAnimalShop.AnimalList.add(cat1);
        myAnimalShop.AnimalList.add(cangShu1);
        Customer customer1=new Customer();
        customer1.name="张三";
        customer1.date=LocalDate.of(2022,3,18);
        LocalDate date=LocalDate.of(2022,3,18);
        Scanner sc=new Scanner(System.in);
        while(myAnimalShop.work){
            switch (sc.next()){
                case "买入":
                    myAnimalShop.Buy(dog1);
                    System.out.println(myAnimalShop.AnimalList);
                    break;
                case "接待":
                    myAnimalShop.Serve(customer1,cangShu1);
                    break;
                case "歇业":
                    myAnimalShop.Off(date);
                    break;
            }
        }
    }
}
