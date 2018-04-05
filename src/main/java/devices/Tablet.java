package devices;
public class Tablet extends MobileDevice{
    //instance variables
    private double screenSize;
    private String[] topThreeApps;
    //Constructor
    public Tablet (double scrSiz, String[] topThrApp, String m, String d, String oS, double c) {
        super(m,d,oS,c);
        this.screenSize = scrSiz;
        this.topThreeApps = topThrApp;
    }
    //Method
}