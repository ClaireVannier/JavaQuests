package Vehicle;

public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return this.brand;
    }

    public String setBrand(String brand) {
        return this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

public abstract String doStuff();

}
