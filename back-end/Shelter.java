public class Shelter {
    private String name;
    private String address;
    private final int maxCapacity;
    private int currCapacity;
    private Location location;

    public Shelter(String name, String address, int maxCapacity, int currCapacity) {
        this.name = name;
        this.address = address;
        this.maxCapacity = maxCapacity;
        this.currCapacity = currCapacity;

    }

    //getters
    public String getName() {
        return name;
    }

    public int getCurrCapacity() {
        return currCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Location getLocation() {
        return location;
    }

    public boolean hasAvailable() {
        return !(maxCapacity == currCapacity);
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrCapacity(int currCapacity) {
        this.currCapacity = currCapacity;
    }

    public void setLocation(String address, float lat, float lon) {
        this.location = new Location(address, lat, lon);
    }
    
    public String toString() {
        return name + " : " + address;
    }


}
