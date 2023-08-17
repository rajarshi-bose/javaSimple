public class Car {
    private int id;
    private String model;
    private String brand;
    private String color;

    public Car(){}
    public Car(int id, String model, String brand, String color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print(){
        System.out.println("Id:" + getId() + ", Model:" + getModel() + ", Brand:" + getBrand() + ", Color:" + getColor());
    }
}
