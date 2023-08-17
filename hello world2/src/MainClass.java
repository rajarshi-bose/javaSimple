import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        List<Car> CarList = new ArrayList<>();
        System.out.println("Hello World");
        Car car1 = new Car();
        car1.setId(69);
        car1.setModel("bingus");
        car1.setBrand("hairless");
        car1.setColor("pink");

        Car car2 = new Car(420,"floppa","furry","brown");
        Car car3 = new Car(42069,"spoingus","furry","beige");
        Car car4 = new Car(333,"footjinx","furry","black");
        Car car5 = new Car(444,"tongus","drum","beige");
        Car car6 = new Car(555,"hemmorroids","bad","red");
        Car car7 = new Car(666,"hitler","bad","red");
        Car car8 = new Car(777,"communism","bad","red");
        Car car9 = new Car(888,"bongus","drum","beige");
        CarList.add(car1);
        CarList.add(car2);
        CarList.add(car3);
        CarList.add(car4);
        CarList.add(car5);
        CarList.add(car6);
        CarList.add(car7);
        CarList.add(car8);
        CarList.add(car9);
        main.printAllCars(CarList);
        List<Car> allBadCars = main.getAllBadCars(CarList);
        List<Car> allBlackCars = main.getAllBlackCars(CarList);
        List<String> carColors = main.getAllCarColors(CarList);
        List<String> carBrands = main.getAllCarBrands(CarList);
        System.out.println("__________________________________________");
        System.out.println("All CAR COLORS: ");
        main.printAllCarColors(carColors);
        System.out.println("__________________________________________");
        System.out.println("All CAR BRANDS: ");
        main.printAllCarColors(carBrands);
        System.out.println("__________________________________________");
        System.out.println("All BLACK cars: ");
        main.printAllCars(allBlackCars);
        System.out.println("All BAD cars: ");
        main.printAllCars(allBadCars);
    }
    public List<String> getAllCarColors(List<Car> curListCar){
        List<String> carColors = new ArrayList();
        carColors = curListCar.stream()
                .map(c -> c.getColor())
                .collect(Collectors.toList());

        List<String> uniqueColors = new ArrayList();
       /* for(String color: carColors) {
            if (!uniqueColors.contains(color)) {

                uniqueColors.add(color);
            }
        }*/

        carColors.forEach(color ->        {
            if(!uniqueColors.contains(color)){
                uniqueColors.add(color);
            }
        });



        return uniqueColors;
    }
    public List<String> getAllCarBrands(List<Car> curListCar){
        List<String> carBrands = new ArrayList();
        carBrands = curListCar.stream()
                .map(c -> c.getBrand())
                .collect(Collectors.toList());

        List<String> uniqueBrands = new ArrayList();
        for(String brand: carBrands) {
            if (!uniqueBrands.contains(brand)) {

                uniqueBrands.add(brand);
            }
        }
        return uniqueBrands;
    }

    public List<Car> getAllBlackCars(List<Car> curListCar){
        List<Car> allBlackCars = new ArrayList();
        allBlackCars = curListCar.stream()
                .filter(c -> c.getColor().trim().equalsIgnoreCase("black"))
                .collect(Collectors.toList());
        return allBlackCars;
    }

    public List<Car> getAllBadCars(List<Car> curListCar) {
        List<Car> allBadCars = new ArrayList();
        for (Car car: curListCar) {
            if(car.getBrand().trim().equalsIgnoreCase("bad")){
                allBadCars.add(car);
            }
        }
        return allBadCars;

    }

    public void printAllCars(List<Car> carList) {
        for(Car car: carList) {
            car.print();
        }
    }


    public void printAllCarColors(List<String> colorList) {
        for(String color: colorList) {
            System.out.println(color);
        }
    }
}

