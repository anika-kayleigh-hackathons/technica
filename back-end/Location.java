public class Location {
    private String address;
    private float lat;
    private float lon;

    public Location(String address, float lat, float lon) {
        this.address = address;
        this.lat = lat;
        this.lon = lon;
    }

    public float[][] getBounds(int distance) {
        float[] lowerLeft = {lat - distance, lon - distance};
        float[] upperLeft = {lat - distance, lon + distance};
        float[] upperRight = {lat + distance, lon + distance};
        float[] lowerRight = {lat + distance, lon + distance};

        float[][] bounds = {lowerLeft, upperLeft, upperRight, lowerRight};
        return bounds;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }
    
    public String getAddress() {
        return address;
    }
}
