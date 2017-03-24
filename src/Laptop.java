/**
 * Created by Mihnea on 23.03.2017.
 */
public class Laptop {

    private String model, make, purchaser;
//    private String make;
//    private String purchaser;
    private int year;

    public Laptop(String model, String make, String purchaser, int year) {
        this.model = model;
        this.make = make;
        this.purchaser = purchaser;
        this.year = year;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", year=" + year +
                '}';
    }
}
