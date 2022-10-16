import java.util.Math;

public class Location {
    private String address;
    private int lat;
    private int lon;
    
    public void Location(String address, int lat, int lon) {
        this.address = address;
        this.lat = lat;
        this.lon = lon;
    }
    
    public int[][] getBounds(int distance) {
        int[] lowerLeft = [lat - distance, lon - distance];
        int[] upperLeft = [lat - distance, lon + distance];
        int[] upperRight = [lat + distance, lon + distance];
        int[] lowerRight = [lat + distance, lon + distance];
        
        int[][] bounds = [lowerLeft, upperLeft, upperRight, lowerRight];
        return bounds;
    }
    
    public int getLat() {
        return lat;
    }
    
    public int getLon() {
        return lon;
    }
}
