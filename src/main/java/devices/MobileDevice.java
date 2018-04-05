package devices;
public class MobileDevice {


    //instance variables
    private String manufacturer;
    private String device;
    protected String operatingSystem;
    private double cost;


    //Constructor
    public MobileDevice (String m, String d, String oS, double c){
        this.manufacturer = m;
        this.device = d;
        this. operatingSystem = oS;
        this.cost = c;
    }


    //Method
    public double calculateDiscount(double discount){
        return ( 100 - ( discount /100 ) ) * cost;
    }


    //Getters and Setters start here
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    //getters and setters end here


}